package my_test;

/*
Compilation:
javac FileName.java

Execution:(Java Virtual Machine)
java FileName

main()------->Predefined function/method.Starting point of program Execution
void---->main block is not going to return anything.
public----->To make main() accessible any where(through out the program).
static------->To load main() first(Top priority in loading main()).
System-------->Predefined class. To gain access over the system resources.
out------>Predefined object.(An object of PrintStream class). To gain access over the output devices of the system.

class name	should start with uppercase letter and be a noun e.g. String, Color, Button, System, Thread etc.
interface name	should start with uppercase letter and be an adjective e.g. Runnable, Remote, ActionListener etc.
method name	should start with lowercase letter and be a verb e.g. actionPerformed(), main(), print(), println() etc.
variable name	should start with lowercase letter e.g. firstName, orderNumber etc.
package name	should be in lowercase letter e.g. java, lang, sql, util etc.
constants name	should be in uppercase letter. e.g. RED, YELLOW, MAX_PRIORITY etc.

Java follows camelcase syntax for naming the class, interface, method and variable.
If name is combined with two words, second word will start with uppercase letter always.
e.g. actionPerformed(), firstName, ActionEvent, ActionListener etc.

A class is a logical entity but an object is a physical entity because an object occupies space in the memory.
 */

public class helloWorld {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );	 
	}
}