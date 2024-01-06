import java.util.Arrays;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

class Reader {
    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, String libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " took " + numberOfBooks + " books.");
    }

    public void takeBook(String... bookTitles) {
        System.out.println(fullName + " took books: " + String.join(", ", bookTitles));
    }

    public void takeBook(Book... books) {
        String[] bookTitles = Arrays.stream(books).map(Book::toString).toArray(String[]::new);
        System.out.println(fullName + " took books: " + String.join(", ", bookTitles));
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " returned " + numberOfBooks + " books.");
    }

    public void returnBook(String... bookTitles) {
        System.out.println(fullName + " returned the books: " + String.join(", ", bookTitles));
    }

    public static void main(String[] args) {
       
        Book book1 = new Book("Adventures", "John Doe");
        Book book2 = new Book("Dictionary", "Jane Smith");
        Book book3 = new Book("Encyclopedia", "Bob Johnson");

     
        Reader reader = new Reader("Petrov VV", "123456", "Science", "01/01/1990", "+123456789");

        reader.takeBook(3);

        reader.takeBook("Adventures", "Dictionary", "Encyclopedia");

        reader.takeBook(book1, book2, book3);

        
        reader.returnBook(3);

        reader.returnBook("Adventures", "Dictionary", "Encyclopedia");
    }
}
