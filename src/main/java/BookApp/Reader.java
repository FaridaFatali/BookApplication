package BookApp;

/**
 *
 * @author Farida Fatali
 */


public class Reader {
    private String name;
    private int age;
    private String gender;
    private Book book;
    private Author author;

    
    
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public void readerInfo(){
        System.out.println("Reader's name: " + name + ".\nAge: " + age + ".\nGender: " + gender);
        
    }
    
}
