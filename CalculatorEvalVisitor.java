import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;


public class CalculatorEvalVisitor extends CalculatorBaseVisitor<Value>{
    CalcScope currentScope = new CalcGlobalScope(null);

    @Override
    public Value visitProg(CalculatorParser.ProgContext ctx) { return visitChildren(ctx); }

    @Override
    public Value visitPrintExpr(CalculatorParser.PrintExprContext ctx) { 
        Value value = visit(ctx.expr());
        if(value.isDouble()) {
            System.out.println(value.asDouble());
        } else if(value.isInteger()){
            System.out.println(value.asInteger());
        } else {
            System.out.println(value.asString());
        }

        return new Value(0); 
    }

    @Override
    public Value visitAssign(CalculatorParser.AssignContext ctx) { 
        
        String name = ctx.ID().getText();
        Value value = visit(ctx.expr());

        if(ctx.op.getText().equals("=")) {
            currentScope.define(name, value);
            return value;
        }

        // check if it's in scope
        Value var = (Value)currentScope.resolve(name);
        Value res = new Value(0);
        if(var != null) {
            Double val = var.asDouble();
            
            switch(ctx.op.getText()) {
                case "+=": {
                    val += value.asDouble();
                    break;
                }
    
                case "-=": {
                    val -= value.asDouble();
                    break;
                }

                case "*=": {
                    val *= value.asDouble();
                    break;
                }

                case "/=": {
                    val /= value.asDouble();
                    break;
                }

                case "%=": {
                    val %= value.asDouble();
                    break;
                }
    
            }

            if(var.isInteger() && value.isInteger()) {
                res = new Value(val.intValue());
            } else {
                res = new Value("val: " + val);
            }
            currentScope.define(name, res);
        }
        return res; 
    }

    @Override
    public Value visitIfStat(CalculatorParser.IfStatContext ctx) { 
        List<CalculatorParser.ConditionBlockContext> conditions = ctx.ifStatement().conditionBlock();
        boolean isEvaluated = false;
        Double val;
        
        for(CalculatorParser.ConditionBlockContext condition : conditions) {
            Value value = visit(condition.expr());
            
            if(value.isDouble()) {
                val = value.asDouble();
            } else {
                val = value.asInteger() / 1.0;
            }
            if(Math.abs(val) > 0.0) {
                isEvaluated = true;
                visit(condition.block());
                break;
            }
        }

        if(!isEvaluated && ctx.ifStatement().block() != null) {
            visit(ctx.ifStatement().block());
        }
        return new Value(0); 
    }

    @Override
    public Value visitWhileStatement(CalculatorParser.WhileStatementContext ctx) { 
        // Create local scope and make that the current scope
        CalcScope oldScope = currentScope;
        CalcLocalScope localScope = new CalcLocalScope(currentScope);
        currentScope = localScope;
         
        // evaluate the condition expression
        Value value = visit(ctx.expr());
        
        while(Math.abs(value.asDouble()) > 0) {
            List<CalculatorParser.StatContext> statements = ctx.stat();
            
            for(CalculatorParser.StatContext statement : statements) {
                visit(statement);
            }
            // re-evaluate the condition expression
            value = visit(ctx.expr());
        }

        currentScope = oldScope; // restore scope
        return new Value(0);
    }

    @Override
    public Value visitForStatement(CalculatorParser.ForStatementContext ctx) { 
        // Create local scope for the for-loop and make it the currentscope
        CalcScope oldScope = currentScope;
        CalcLocalScope localScope = new CalcLocalScope(currentScope);
        currentScope = localScope;
       
        // evaluate the first assignment first
        visit(ctx.assign(0));

        // evaluate the condition expression
        Value condition = visit(ctx.expr());

        while(Math.abs(visit(ctx.expr()).asDouble()) > 0.0) { // evaluate the condition before evaluating the statements
            List<CalculatorParser.StatContext> statements = ctx.stat();
            for(CalculatorParser.StatContext statement : statements) { // visit the statement block
                visit(statement);
            }
            // evaluate assignemnt 2 (i.g incrementor)
            visit(ctx.assign(1));
        }

        currentScope = oldScope; // restore scope
        return new Value(0);
    }

    @Override
    public Value visitFuncCall(CalculatorParser.FuncCallContext ctx) { 
        String name = ctx.ID().getText();
        Value value = new Value(0);

        // check if function is in scope
        CalcFunctionScope function = (CalcFunctionScope) currentScope.resolve(name);
        
        if(function == null) {
            CalculatorRun.error(ctx.ID().getSymbol(), "Function does not exist");
            return new Value(0);
        }

        // make currentscope point to the function scope (scope that was made during func declaration)
        CalcScope oldScope = currentScope;
        currentScope = function;

        List<CalculatorParser.ExprContext> args = ctx.arguments().expr();
        // use argument values to map parameters to these args values
        for(int i = 0; i < args.size(); i++) {
            function.define(function.getParamList().get(i).getText(), visit(args.get(i)));
        }
        
       try {
        for(CalculatorParser.StatContext statement : function.getStatementList()) {
            value = visit(statement);
         }
       } catch (ReturnStatementException e) {
           Value retValue = e.retValue;
           currentScope = oldScope; // restore scope
           if(retValue == null) {
               return new Value(0);
           } else {
               return retValue;
           }
           
       }

        currentScope = oldScope; // restore scope

        return new Value(0);

    }

    @Override
    public Value visitFuncDeclaration(CalculatorParser.FuncDeclarationContext ctx) { 
        // a function scope is created for each function declaration
        // its parameters and statement block are added to this scope
        // for later use in the function calls

        String name = ctx.ID().getText();
        CalcFunctionScope functionScope = new CalcFunctionScope(name, currentScope, ctx.params().param(), ctx.stat());

        currentScope.define(name, functionScope); // add function scope to current scope
        System.out.println("function scope created " + functionScope.toString());

        return new Value(0);
    }

    @Override 
    public Value visitParams(CalculatorParser.ParamsContext ctx) { 
         return visit(ctx);
    }

    @Override 
    public Value visitBlock(CalculatorParser.BlockContext ctx) { 
        // current scope should now point to new local scope
        CalcScope oldScope = currentScope;
        CalcLocalScope localScope = new CalcLocalScope(currentScope);
        currentScope = localScope;
         
        List<CalculatorParser.StatContext> statements = ctx.stat();
        
        for(CalculatorParser.StatContext statement : statements) {
            visit(statement);
        }

        currentScope = oldScope; // restore scope
        return new Value(0);
    }

    @Override
    public Value visitExprParen(CalculatorParser.ExprParenContext ctx) { 
        return visit(ctx.expr()); 
    }
    
    @Override
    public Value visitExprExpo(CalculatorParser.ExprExpoContext ctx) { 
        Double base = visit(ctx.expr(0)).asDouble();
        Double power = visit(ctx.expr(1)).asDouble();

        return new Value(Math.pow(base, power)); 
    }
    
    @Override
    public Value visitExprAtom(CalculatorParser.ExprAtomContext ctx) { 
        return visit(ctx.atom()); 
    }

    @Override 
    public Value visitAtomNum(CalculatorParser.AtomNumContext ctx) { 
        Value val;
        
        if(ctx.number().DOUBLE_NUM() != null)  {
            val = new Value(Double.valueOf(ctx.number().DOUBLE_NUM().getText()));
        } else {
            val = new Value(Integer.valueOf(ctx.number().INTEGER_NUM().getText()));
        }

        return val; 
    }

    @Override 
    public Value visitMulDiv(CalculatorParser.MulDivContext ctx) { 
        Value left = visit(ctx.expr(0));
        Value right = visit(ctx.expr(1));

        Value value;

        if(ctx.MUL() != null) {
            // both int
            if(left.isInteger() && right.isInteger()) {
                value = new Value(left.asInteger() * right.asInteger());
            } else {
                value = new Value(left.asDouble() * right.asDouble());
            }

            return value;
        } else if(ctx.DIV() != null) {
            // both int
            if(left.isInteger() && right.isInteger()) {
                value = new Value(left.asInteger() / right.asInteger());
            } else {
                value = new Value(left.asDouble() / right.asDouble());
            }

            return value;
        }

        // both int
        if(left.isInteger() && right.isInteger()) {
            value = new Value(left.asInteger() % right.asInteger());
        } else {
            value = new Value(left.asDouble() % right.asDouble());
        }

        return value;

        
    }

    @Override 
    public Value visitPlusMinus(CalculatorParser.PlusMinusContext ctx) { 
        Value left = visit(ctx.expr(0));
        Value right = visit(ctx.expr(1));

        Value value;

        if(ctx.MINUS() != null) {
            // both int
            if(left.isInteger() && right.isInteger()) {
                value = new Value(left.asInteger() - right.asInteger());
            } else {
                value = new Value(left.asDouble() - right.asDouble());
            }

            return value;
        }

        // both int
        if(left.isInteger() && right.isInteger()) {
            value = new Value(left.asInteger() + right.asInteger());
        } else {
            value = new Value(left.asDouble() + right.asDouble());
        }

        return value;
    }

    @Override 
    public Value visitReturnStatement(CalculatorParser.ReturnStatementContext ctx) { 
        Value retValue = visit(ctx.expr()); 
        try { 
            throw new ReturnStatementException("Return statement", retValue); 
        } 
        catch(ReturnStatementException e) { 
            throw e;
        } 
    }

    @Override 
    public Value visitRelExpr(CalculatorParser.RelExprContext ctx) { 
        Double left = visit(ctx.expr(0)).asDouble();
        Double right = visit(ctx.expr(1)).asDouble();

        if(ctx.GT() != null) {
            if(left > right) {
                return new Value(new Integer(1));
            }
            return new Value(new Integer(0));
        }

        if(ctx.GE() != null) {
            if(left >= right) {
                return new Value(new Integer(1));
            }
            return new Value(new Integer(0));
        }

        if(ctx.LT() != null) {
            if(left < right) {
                return new Value(new Integer(1));
            }
            return new Value(new Integer(0));
        }

        if(ctx.LE() != null) {
            if(left <= right) {
                return new Value(new Integer(1));
            }
            return new Value(new Integer(0));
        }

        if(ctx.EQ() != null) {
            if(left == right) {
                return new Value(new Integer(1));
            }
            return new Value(new Integer(0));
        }
        return new Value(new Integer(0));
    }
	
    @Override 
    public Value visitBoolExpr(CalculatorParser.BoolExprContext ctx) { 
        if(ctx.AND() != null) {
            Double left = visit(ctx.expr(0)).asDouble();
            Double right = visit(ctx.expr(1)).asDouble();

            if(Math.abs(left) > 0 && Math.abs(right) > 0) {
                return new Value(new Integer(1));
            }
            return new Value(new Integer(0));
        }

        Double left = visit(ctx.expr(0)).asDouble();
        Double right = visit(ctx.expr(1)).asDouble();

        if(Math.abs(left) > 0 || Math.abs(right) > 0) {
            return new Value(new Integer(1));
        }
        return new Value(new Integer(0));
    }


    @Override
    public Value visitNotExpr(CalculatorParser.NotExprContext ctx) { 
        Double value = visit(ctx.expr()).asDouble();

        if(Math.abs(value) >= 1.0) {
            
            return new Value(new Integer(0));
        }
        return new Value(new Integer(1));
    }


    @Override
    public Value visitSpecialSqrt(CalculatorParser.SpecialSqrtContext ctx) { 
        return new Value(new Double(Math.sqrt(visit(ctx.expr()).asDouble()))); 
    }

    @Override
    public Value visitSpecialRead(CalculatorParser.SpecialReadContext ctx) { 
        Value value;
        if(ctx.number().DOUBLE_NUM() != null) {
            value = new Value(new Double(ctx.number().DOUBLE_NUM().getText()));
        } else {
            value = new Value(new Integer(ctx.number().INTEGER_NUM().getText()));
        }
        return value; 
    }

    @Override
    public Value visitMathSine(CalculatorParser.MathSineContext ctx) { 
        return new Value(new Double(Math.sin(Math.toRadians(visit(ctx.expr()).asDouble())))); 
    }

    @Override
    public Value visitMathCosine(CalculatorParser.MathCosineContext ctx) { 
        return new Value(new Double(Math.cos(Math.toRadians(visit(ctx.expr()).asDouble())))); 
    }

    @Override
    public Value visitMathLog(CalculatorParser.MathLogContext ctx) { 
        return new Value(new Double(Math.log(visit(ctx.expr()).asDouble()))); 
    }

    @Override
    public Value visitMathExp(CalculatorParser.MathExpContext ctx) { 
        return new Value(new Double(Math.log(visit(ctx.expr()).asDouble()))); 
    }

    @Override
    public Value visitExprPrint(CalculatorParser.ExprPrintContext ctx) { 
        return ctx.listExpr() == null ? new Value(0) : this.visitListExpr(ctx.listExpr());
    }

    @Override
    public Value visitListExpr(CalculatorParser.ListExprContext ctx) { 
        String res = "";
        for(CalculatorParser.ExprContext exprContext : ctx.expr()) {
            Value value = visit(exprContext);
            if(value.isInteger()) {
                res = res + value.asInteger();
            } else  {
                res = res + value.asDouble();
            }
        }

        return new Value(res);
    }

    @Override 
    public Value visitPostFixUnaryExpr(CalculatorParser.PostFixUnaryExprContext ctx) { 
        String name = ctx.ID().getText();
        // check if variable has been defined in scope
        Value value = (Value) currentScope.resolve(name);
        if(value == null) {
            CalculatorRun.error(ctx.ID().getSymbol(), "no such variable exists: " + name);
            return new Value(0);
        }
        if(ctx.MM() != null) {
            value.decrement();
        }

        if(ctx.PP() != null) {
            value.increment();
        }

        return value; 
    }
	
	@Override public Value visitPreFixVar(CalculatorParser.PreFixVarContext ctx) { 
        String name = ctx.preFixUnaryExpr().ID().getText();
        // check if variable has been defined in scope
        Value value = (Value) currentScope.resolve(name);

        if(value == null) {
            CalculatorRun.error(ctx.preFixUnaryExpr().ID().getSymbol(), "no such variable exists: " + name);
            return new Value(0);
        }
        if(ctx.preFixUnaryExpr().MM() != null) {
            value.decrement();
        }

        if(ctx.preFixUnaryExpr().PP() != null) {
            value.increment();
        }

        return value; 
    }

    @Override 
    public Value visitUnary(CalculatorParser.UnaryContext ctx) { 
        Value value = visit(ctx.expr());
        if(ctx.MINUS() != null) {
            Value negated;
            if(value.isDouble()) {
                negated = new Value (value.asDouble() * -1);
            } else {
                negated = new Value (value.asInteger() * -1);
            }
            return negated; 
        }
        return value; 
    }
    
    @Override
    public Value visitAtomId(CalculatorParser.AtomIdContext ctx) { 
        String name = ctx.ID().getText();
        // check if variable has been defined in scope
        Value var = (Value)currentScope.resolve(name);
        if(var == null) {
            CalculatorRun.error(ctx.ID().getSymbol(), "no such variable exists: " + name);
            return new Value(0);
        } 
        if(var instanceof CalcFunctionScope) {
            CalculatorRun.error(ctx.ID().getSymbol(), name + " is not a variable, it is a function name");
            return new Value(0);
        } 
        return  var; 
    }
}

