package BookApp;

/**
 *
 * @author Farida Fatali
 */
public class Reader {
    String name;
    {
        name = new String("Farida");
        System.out.println("Reader's name: " + name);
    }
    
    int age;
    {
        age = 32;
        System.out.println("Age of the reader: " + age);
    }
    
    String gender;
    {
        gender = new String("female");
        System.out.println("The gender of the reader: " + gender);
    }
    
    Book book;    
    Author author;

    
    
    public Reader() {
    }
    
    public Reader(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        
    }

    public Reader(String name, int age, String gender, Book book, Author author) {
        this(name, age, gender);
        this.book = book;
        this.author = author;
    }
        
    
    
    public void read(Book book){
        System.out.println("Reading book: " + "'" + book.title + "'");
        System.out.println("Author: " + book.author.name);
        System.out.println("Page: " + book.page);
        System.out.println("Genre: " + book.type);
        System.out.println("Hard Cover: " + book.isHardCover);
        System.out.println("Current page: " + book.currentPage);
        
    }
    
    
    public void printInfo(){
        System.out.println("Reader name: " + this.name);
        System.out.println("Reader age: " + this.age);
        System.out.println("Reader gender: " + this.gender);
        
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
