package JavaDay5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListHashSet {
	
	public static String arrayTrial(Integer i) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Contessa");
		
		return cars.get(i);
		
	}
	                            

	public static Integer linkedTrial(String c) {
		
		LinkedList<String> carsL = new LinkedList<String>();
		carsL.add("BMW");
		carsL.add("Volvo");
		carsL.add("Contessa");
		carsL.add(c);
		
		Iterator<String> it = carsL.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		return carsL.size();
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(arrayTrial(2));
		System.out.println(linkedTrial("Mini"));
				
		

	}

}
