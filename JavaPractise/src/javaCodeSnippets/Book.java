package javaCodeSnippets;

public class Book {
	
	String title;
	String author;
	double price;

	public Book(String titl, String autho, double pric) {
		
	title=titl;
	author=autho;
	price=pric;
		
//	System.out.println("The name of the book is " + title);
//	System.out.println("The author is " + author);
			
	}
	
	public void setTitle(String name) {
		title = name;
		
	}
	
	public void setAuthor(String au) {
	
		author = au;
		
	}
	
	public void setPrice(double pr) {
		
		price = pr;

	}
	
	public String getTitle() {
	
		return title;
		
	}
	
	public String getAuthor() {
		
		return author;
		
	}

}
