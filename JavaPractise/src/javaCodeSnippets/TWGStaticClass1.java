package javaCodeSnippets;

public class TWGStaticClass1 {
	
	static String empName;
	String empDesign;
	
	
	public static void setEmpName(String name) {
	
		
		empName = name;
		System.out.println("This is inside set name Method" + empName);
		
	}
	
	
	public static String getEmpname() {
		
		System.out.println("This is inside the get name method which returns emp name");
		return empName;
		
	}
	
	public void setEmpDesig(String deg) {
		empDesign = deg;
		System.out.println("This is inside the set emp designation method");
		
	}
	
	public String getEmpDesig() {
		
		System.out.println("This is inside the get designation method");
		return empDesign;
	}


}
