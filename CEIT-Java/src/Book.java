
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double price;

    // default constructor
    public Book(){
        title = "";
        author = "";
        publicationYear = 0;
        price = 0.0;
    }

    // constructor with parameters (overloaded constructor)
    public Book(String title, String author, int publicationYear, double price){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Price: " + price);
    }

}
