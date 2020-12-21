package javaCodeSnippets;

public class TWGemployees {
	
	String empName;
	String empDesign;
	String empCode;
	int empYrs;
	
	//No argument Constructor
	
	public TWGemployees() {
		
		System.out.println("This is inside the no argument constuctor");
		empName = "Shireen Kamra";
		empDesign = "QA";
		empCode = "67878";
		empYrs = 12;

	}
	
	public TWGemployees(String name, String designation) {
		
		empName = name;
		empDesign = designation;
		
			
		
	}
	
	
	
	
	public static void main(String[] args) {
		
//		TWGemployees emp = new TWGemployees();
//		System.out.println(emp.empName);
//		System.out.println(emp.empDesign);
//		System.out.println(emp.empCode);
//		System.out.println(emp.empYrs);
//		
		
		TWGemployees emp1 = new TWGemployees("Arijit", "Architect");
		System.out.println(emp1.empName);
		System.out.println(emp1.empDesign);
		
		
		TWGemployees emp2 = new TWGemployees("Jothi", "QA");
		System.out.println(emp2.empName);
		System.out.println(emp2.empDesign);
	

	}
	
}
