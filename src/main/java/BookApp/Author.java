package BookApp;

/**
 *
 * @author Farida Fatali
 */
public class Author {
    String name;
    {
        name = new String("Khaled Hosseini");
        System.out.println("The author name: " + name);
    }

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
    
    
}
