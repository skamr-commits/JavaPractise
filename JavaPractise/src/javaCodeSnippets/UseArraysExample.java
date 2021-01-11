package javaCodeSnippets;



public class UseArraysExample {

	public static void main(String[] args) {
		
		String[] names = {"Lali", "Pixi", "Gogo"};
		
		printNames (names);
		
		
	
		
		System.out.println("The length of the array is" + names.length);
		names[1] = "Mum";
		
		printNames (names);
		
	}
	
	public static void printNames(String[] temp) {
		

		for  (String x : temp) {
			
			System.out.println("The name in this position is" + x);
		}
		
		
	}

}
