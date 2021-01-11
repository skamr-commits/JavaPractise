package javaCodeSnippets;

public class ThisKeyword {
	
	int a = 50;
	int b = 60;
	
	public ThisKeyword(int a, int b) {
		
		//this(); 
		// The above statement calls the default constructor inside a parameterized constructor
		
		this.a = a;
		this.b = b;
	
		
		
	}
	
	public ThisKeyword(){
		
		this(10,20);
		
		System.out.println("This is the default constructor");
		
		
	}

	public static void main(String[] args) {
		
	ThisKeyword obj = new ThisKeyword();
	System.out.println(obj.a);
	System.out.println(obj.b);
	
		
		
	}
	
	

}
