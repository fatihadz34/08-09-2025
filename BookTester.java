public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("The Morning Glory", 1995, 75000);
        book2.display();

        Book book3 = new Book("The Bends", 1995, 50000);
        book3.display();
    }
}
