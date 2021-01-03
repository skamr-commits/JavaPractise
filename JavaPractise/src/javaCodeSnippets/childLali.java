package javaCodeSnippets;

public class childLali extends parentSujata{
	
	String name4 = "Dhruv";
	static String name5 = "Rana";
	
	public void mychildrennames() {
		System.out.println("My children names are" + name1 + " " + name2);
	}
	
	

	public static void main(String[] args) {
	
	childLali myObj = new childLali();
	
	//name 1 and name 2 are static variables so can be accessed without an object name. Name 3 is not static so needs an obj
	
	System.out.println("My siblings are" + name1 + name2 + myObj.name3);
	
	//name 4 is not static so needs an obj even if it belongs to my own class. name 5 is static so can be used without an obj
	System.out.println("My children are" + myObj.name4 + name5);

	}

}
