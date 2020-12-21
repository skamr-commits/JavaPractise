package javaCodeSnippets;

public class TwgClass2 {

	public static void main(String[] args) {
		
		TwgClass1 twg = new TwgClass1();
		twg.setEmpName("Shireen");
		twg.setEmpDesig("QA");
		String name = twg.getEmpname();
		System.out.println("The name is " + name);
		System.out.println("The name is " + twg.getEmpname());
		System.out.println("The design is" + twg.getEmpDesig());
		

	}

}
