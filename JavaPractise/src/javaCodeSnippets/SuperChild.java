package javaCodeSnippets;


	
	public class SuperChild extends SuperParentSujata{
		
		String name1 = "Dhruv";
		String name2 = "Rana";
		
		public void mychildrennames() {
			System.out.println("My children names are" + name1 + " " + name2);
			
			//Super can be used to access my parent's variables without being overridden by the child's variables or methods. Super cannot be used 
			//inside static method or static variable
			
			System.out.println("My siblings are" + super.name1 + super.name2 + super.name3);
			
		}
		
		

		public static void main(String[] args) {
	
			//To access my own method I have created an object. I was trying to access the method without an object but it meant making my variables static and I would have to use super inside a static method which is not allowed
			
			SuperChild myObj = new SuperChild();
			myObj.mychildrennames();
		
		

		}

	


}
