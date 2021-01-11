package javaCodeSnippets;


public class MultiInheritanceChild extends MultiInheritanceParent{
	
	String name1 = "Shireen";
	String name2 = "Pallavi";
	String name3 = "Rohit";
	
	public void printChildrenNames() {
		
//		MultiInheritanceChild myObj = new MultiInheritanceChild();
		System.out.println("My chilren's names are" + name1 + name2 + name3);
		System.out.println("My aunt's names are" + super.name1 + super.name2 + super.name3 + super.name4 + super.name5);
		
	}
	
	


}
