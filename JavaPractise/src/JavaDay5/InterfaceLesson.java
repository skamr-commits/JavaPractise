package JavaDay5;

import java.util.HashMap;

public class InterfaceLesson {
	
	public static String learnHashmap(String a){
	
	HashMap<String, String> geogo = new HashMap<String, String>();
	geogo.put("India", "Ganga");
	geogo.put("Bangladesh","Brahmaputra");
	geogo.put("Brazil","Amazon");
	geogo.put("NewZealand", "Waikato");
	
	for (String i : geogo.keySet()) {
		System.out.println(i);
		
	}
	
	for (String j: geogo.keySet()) {
		System.out.println("The matching pair is" + "Key:" + j + "Value:" + geogo.get(j));
	
	}
	
	return geogo.get(a);
	
	}
	
//	public static void printHashmap(String b) {
//		System.out.println("The value is" + learnHashmap(b).keySet());
//		}
	

	public static void main(String[] args) {
		

		System.out.println("The river flowing through the country is" + learnHashmap("Bangladesh"));
		
		
		

	}

}
