package javaCodeSnippets;

public  class CarExercise {
	
	static String brand;
	
	public CarExercise() {
		
		brand = "Ford";
	
	}
	
	public String getBrand(String brd) {
		
		brand = brd;
		System.out.println("The car brand is" + brand);
		return brand;
	
	}

	public static void main(String[] args) {
		
		CarExercise myObj = new CarExercise();
		myObj.getBrand(brand);
		
	}

}
