package BookApp;


/**
 *
 * @author Farida Fatali
 */

// Lessons of - Classes, Objects, Constructors, this, get/set, Initializer Blocks

public class ReaderTest {
    public static void main(String[] args) {
        
//        Reader reader1 = new Reader("Farida", 32, "woman");
//        Book book1 = new Book();
//        book1.title = "Origin";        
//        book1.page = 461;
//        book1.type = "Crime";
//        book1.isHardCover = true;
//        book1.currentPage = 266;
//        Author author1 = new Author("Dan Brown");
//        book1.author = author1;
//        System.out.println("----------------------");
//        
//        Reader reader2 = new Reader("Ali", 28, "man");
//        Book book2 = new Book();
//        book2.title = "A Thousand Splendid Suns";        
//        book2.page = 384;
//        book2.type = "Novel";
//        book2.isHardCover = false;
//        book2.currentPage = 150;
//        Author author2 = new Author("Khaled Hosseini");
//        book2.author = author2;
//        System.out.println("----------------------");
//       
//        reader1.printInfo();
//        System.out.println();
//        reader1.read(book1);
//        System.out.println();
//        System.out.println("----------------------");
//        System.out.println();
//        reader2.printInfo();
//        System.out.println();
//        reader2.read(book2);
//        System.out.println();
        
        System.out.println("Initializer blocks:");
        System.out.println();
        System.out.println("Book info:");
        new Book();
        System.out.println();
        System.out.println("Author info");
        new Author();
        System.out.println();
        System.out.println("Reader info");
        new Reader();
        System.out.println();
    }
    
}
