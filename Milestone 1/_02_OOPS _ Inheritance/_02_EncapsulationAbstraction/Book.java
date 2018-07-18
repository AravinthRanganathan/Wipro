package _02_EncapsulationAbstraction;

class Author{
	private String Author_name,email;
	private char gender;
	Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(String Author_name,String email,char gender) {
		this.Author_name=Author_name;
		this.email=email;
		this.gender=gender;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
public class Book{
	private String book_Name;
	private Author author;
	private double price;
	private int qtyInStock;
	Book(){
			
		}
	Book(String name,Author author,double price,int qtyInStock){
		this.book_Name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return book_Name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public static void main(String[] args) {
		Author obj1=new Author("Aravinth","aravinth10rock@gmail.com",'M');
		Book obj2=new Book("Java Fundamentals",obj1,5000,25);
		System.out.println("-----------Book Details--------------\n");
		System.out.println("Book_Name\t Price \tQuantity_in_stock\n");
		System.out.println(obj2.book_Name+" "+obj2.price+" "+obj2.qtyInStock);
		System.out.println("-----------Author Details--------------\n");
		System.out.println("Author_Name\t Email \t\t\t\t Gender");
		System.out.println(obj2.author.getAuthor_name()+"\t"+obj2.author.getEmail()+"\t"+obj2.author.getGender());
	}
}
