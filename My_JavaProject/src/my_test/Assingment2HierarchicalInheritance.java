package my_test;

/*
 Sample Program Of Hierarchical Inheritance
 */

class NewParent {
	
	 public void parentMethod()
	   {
	      System.out.println("Parent method of Class Parent");
	   }
}

class NewChild extends NewParent {
	
	 public void childMethod()
	   { 
	      System.out.println("Child method of Class Child");
	   }
}

class GrandChild1 extends NewChild {
	
	 public void grandChild1Method()
	   {
	      System.out.println("Grand Child1 Method of Class GrandChild1");
	   }
}

class GrandChild2 extends NewChild {
	
	 public void grandChild2Method()
	   {
	      System.out.println("Grand Child2 Method of Class GrandChild2");
	   }
}

public class Assingment2HierarchicalInheritance {

	public static void main(String[] args) {
		
		GrandChild1 gch1 = new  GrandChild1();
		GrandChild2 gch2 = new  GrandChild2();
		
		gch1.grandChild1Method();
		gch1.childMethod();
		gch1.parentMethod();

		gch2.grandChild2Method();
		gch2.childMethod();
		gch2.parentMethod();
	}
}