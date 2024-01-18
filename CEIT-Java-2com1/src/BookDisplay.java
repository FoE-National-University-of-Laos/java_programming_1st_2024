public class BookDisplay {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99);
        book.displayBookDetails();
        book1.displayBookDetails();
    }
}
