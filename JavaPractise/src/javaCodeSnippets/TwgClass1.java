package javaCodeSnippets;

public class TwgClass1 {
	
	String empName;
	String empDesign;
	
	
	public void setEmpName(String name) {
	
		empName = name;
		System.out.println("This is inside set name Method" + empName);
		
	}
	
	
	public String getEmpname() {
		
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
