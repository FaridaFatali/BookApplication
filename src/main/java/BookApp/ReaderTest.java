package BookApp;


/**
 *
 * @author Farida Fatali
 */

// Access modifiers, getter/setter

public class ReaderTest {
    public static void main(String[] args) {
        
        Reader reader1 = new Reader();
        reader1.setName("Farida");
        reader1.setAge(32);
        reader1.setGender("Female");
        
        Book book1 = new Book();
        book1.setTitle("Origin");        
        book1.setPage(461);
        book1.setType("Crime");
        book1.setHardCover(true);
        book1.setCurrentPage(266);
        Author author1 = new Author();
        author1.setName("Dan Brown");
        book1.setAuthor(author1);
        reader1.readerInfo();
        book1.bookInfo();
        author1.authorInfo();
        System.out.println("----------------------");
        
        Reader reader2 = new Reader();
        reader2.setName("Ali");
        reader2.setAge(25);
        reader2.setGender("Male");
        
        Book book2 = new Book();
        book2.setTitle("A Thousand Splendid Suns");        
        book2.setPage(384);
        book2.setType("Novel");
        book2.setHardCover(false);
        book2.setCurrentPage(150);
        Author author2 = new Author();
        author2.setName("Khaled Hosseini");
        book2.setAuthor(author2);
        reader2.readerInfo();
        book2.bookInfo();
        author2.authorInfo();

        
    }
    
}
