

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double price;

    // This is a default constructor
    public Book(){
        title = "";
        author = "";
        publicationYear = 0;
        price = 0.0;
    }
    // This is an overloaded constructor
    public Book(String title, String author, int publicationYear, double price){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    // This is a displayBookDetails method
    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Price: " + price);
        if (price < 10000.0){
            System.out.println("This book is cheap!");
            if (price == 0){
                System.out.println("This book is free!");
            }
        } else if (price <= 50000.0){
            System.out.println("This book is affordable!");
        } else {
            System.out.println("This book is expensive!");
        }
    }

}
