JFLAGS = -g
JC = javac
JVM = java

.SUFFIXES: .java .class
.java.class:
	 $(JC) $(JFLAGS) $*.java

CLASSES = \
		Calc*.java \
		ReturnStatementException.java \
		Value.java 


all: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class


