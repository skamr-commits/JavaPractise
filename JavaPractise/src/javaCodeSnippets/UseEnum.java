package javaCodeSnippets;

public class UseEnum {
	
	EnumKeyword name;
	
	public UseEnum(EnumKeyword name){
		
		this.name = name;
		
		
		
	}
	
	public void printEnum() {
		
//		if(name==="Shireen") {
//			
//			System.out.println("I work at TWG");
//		}
//		
//		else {
//			
//			System.out.println("I work at Vector");
//		}
			
		
		
		switch(name) {
		
		case Shireen:
		System.out.println("TWG");
		
		break;
		
		case Arijit:
		System.out.println("Vector");
		break;
			
			default:
				break;
				
		
		}
		
		
	}
	
	

	public static void main(String[] args) {
	
		UseEnum myObj = new UseEnum(EnumKeyword.Arijit);
		myObj.printEnum();
		
		UseEnum myObj2 = new UseEnum(EnumKeyword.Shireen);
		myObj2.printEnum();
			

	}

}
