package javaCodeSnippets;

public class MultiInheritanceChildChild extends MultiInheritanceChild{
	
	String name1 = "Dhruv";
	String name2 = "Rana";

	public static void main(String[] args) {
	
		MultiInheritanceChildChild myObj2 = new MultiInheritanceChildChild();
		myObj2.printChildrenNames();
		System.out.println("And also" + myObj2.name1 + myObj2.name2);
		

	}

}
