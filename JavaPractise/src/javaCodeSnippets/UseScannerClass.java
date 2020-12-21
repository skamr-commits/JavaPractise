package javaCodeSnippets;

import java.util.Scanner;

public class UseScannerClass {
	
	//Swap a number

	public static int Numswap(int y) {
		
		return y + 9;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter a number");
		
		//why is there a warning at myObj
		
		Scanner myObj = new Scanner(System.in);
		num = myObj.nextInt();
		
		
		System.out.println("The swapped number is " + Numswap(num) );
		
		

	}

}
