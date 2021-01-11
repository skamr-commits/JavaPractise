package javaCodeSnippets;

public class HierarchicalInheritanceChild extends MultiInheritanceChild{
	
	String name4 = "Dhruv";
	String name5 = "Rana";
	
	public void printTheNames() {
		
		
		HierarchicalInheritanceChild myObj = new HierarchicalInheritanceChild();
		System.out.println("My family members are");
		System.out.println(myObj.name1 + myObj.name2 + myObj.name3);
		System.out.println(myObj.name4 + myObj.name5);
		
	}
	
	

}
