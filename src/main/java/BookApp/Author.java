package BookApp;

/**
 *
 * @author Farida Fatali
 */
public class Author {
    private String name;
    
    
    public Author() {
    }
    
    public Author(String name) {
        this.name = name;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void authorInfo(){
        System.out.println("Author name: " + name);
    }
}
