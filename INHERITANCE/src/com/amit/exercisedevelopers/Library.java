package com.amit.exercisedevelopers;

class Book
{   String bname;
	int pages;
	String publication;
	String author;
	double price;
	public Book(String bname, int pages, String publication, String author, double price) 
	{
		super();
		this.bname = bname;
		this.pages = pages;
		this.publication = publication;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Book [bname=" + bname + ", pages=" + pages + ", publication=" + publication + ", author=" + author
				+ ", price=" + price + "]";
	}
	
	
	
	
	
}
class Ebook extends Book
{
	String format;
	public Ebook(String bname, int pages, String publication, String author, double price, String format) 
	{
		super(bname, pages, publication, author, price);
		this.format = format;
	}
	@Override
	public String toString() 
	{
		return "Ebook [bname=" + bname + ", pages=" + pages + ", publication=" + publication + ", author=" + author
				+ ", price=" + price + ", format=" + format + "]";
	}
}
public class Library 
{

	public static void main(String[] args) 
	{
	   Ebook ebook=new Ebook("Data Structure Using c",550,"Oxford Publication","Reema Theraja",450.00,"softcopy");
	   System.out.println(ebook.toString());
	}

}
