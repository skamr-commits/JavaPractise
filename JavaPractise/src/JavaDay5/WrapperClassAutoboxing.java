package JavaDay5;

public class WrapperClassAutoboxing {

	//You need wrapper classes because Collections can only store objects and wrapper classes create objects out of Java primitive datatypes
	
	public static int addNumbers(Integer x, Integer y){
	      return (x+y);
	   }
	
	
	public static void main(String[] args) {
		
		Integer num = 10;
		Character myChar = 'A';
		Double myDouble = 5.99;
		System.out.println(num);
		System.out.println(myChar);
		System.out.println(myDouble);
	
	//intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
		
		
		String myString = num.toString();
		System.out.println(myString);
		System.out.println("the length of string is" + myString.length());
		
		Integer result = addNumbers(10, 20);
	    System.out.println(result);
	
		
		
	}

}
