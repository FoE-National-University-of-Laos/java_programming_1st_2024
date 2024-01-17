

public class BookDetail {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Da Vinci Code", "Dan Brown", 2003, 15.99);
        Book book3 = new Book("War and Peace", "Leo Tolstoy", 1869, 12.99);

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();
        book3.displayBookDetails();
    }
}
