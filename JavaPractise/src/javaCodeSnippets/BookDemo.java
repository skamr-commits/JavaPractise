package javaCodeSnippets;

public class BookDemo {

	public static void main(String[] args) {
		
		Book myObj = new Book("Developing Java Software","Russel Winderand",79.95);
		System.out.println("The name of the book is" + myObj.title);
		System.out.println("The name of the author is" + myObj.author);
	}
}
