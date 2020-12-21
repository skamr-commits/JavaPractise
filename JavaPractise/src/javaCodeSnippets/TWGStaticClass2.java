package javaCodeSnippets;

public class TWGStaticClass2 {

	public static void main(String[] args) {
				
		
		//For accessing a static method and variable from outside we don't need to create an object
		TWGStaticClass1.setEmpName("Arijit");
		TWGStaticClass1.getEmpname();
		
		
		TWGStaticClass1 nonstatic = new TWGStaticClass1();
		nonstatic.setEmpDesig("Architect");
		nonstatic.getEmpDesig();

	}

}
