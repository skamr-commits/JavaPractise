package javaCodeSnippets;

public class MethodOverloading {

	public static void main(String[] args) {
		
		studentInfo("Shireen","Kamra","shireenkamra@gmail.com","021346578");
		studentInfo("Arijit","Lahiri","021566544");
		studentInfo("Dhruv","Lahiri","dhruvlahiri@gmail.com");
		studentInfo("Rana","Lahiri");
		studentInfo();
	
	}
	
	public static void studentInfo(String firstName, String lastName, String email, String phone) {
		
		System.out.println("My details are " + firstName + " " + lastName);
		System.out.println("My email is " + email);
		System.out.println("My phone is " + phone);
		
	}
	
	public static void studentInfo(String firstName, String lastName,String phone) {
		
		System.out.println("My details are " + firstName + " " + lastName);
		System.out.println("My contact is " + phone);
		
	}
	
	public static void studentInfo(String firstName, String lastName) {
		
		System.out.println("My details are " + firstName + " " + lastName);
		
	}
	
	
	public static void studentInfo() {
		boolean conctTxt = false;
		int age = 25;
		String firstName = "Shireen";
		String lastName = "Kamra";
		String email = "shireenkamra@gmail.com";
		String phone = "642102437721";
		String courseInterest = "Java concepts";
		char gender = 'F';
		
		
		
		System.out.println("The name of the student is - " +firstName + " " + lastName );
		System.out.println("She is a " + gender);
		System.out.println("Her contact email is " + email);
		System.out.println("Her contact number is " + phone);
		System.out.println("her opted course is " + courseInterest);
		System.out.println("She is " + age + " years old");
		System.out.println("She is contactable by phone " + conctTxt);
		
		
	}

}
