package BookApp;

/**
 *
 * @author Farida Fatali
 */
public class Book {
    private Author author;
    private String title;
    private int page;
    private String type;
    private boolean isHardCover;
    private int currentPage;
    
    
    public Book() {
    }

    public Book(Author author, String title, int page, String type) {
        this.author = author;
        this.title = title;
        this.page = page;
        this.type = type;
    }
    
    

    public Book(Author author, String title, int page, String type, boolean isHardCover, int currentPage) {
        this(author, title, page, type);
        this.isHardCover = isHardCover;
        this.currentPage = currentPage;
    }
    

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.isHardCover = hardCover;
    }
    

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    
    public void bookInfo(){
    System.out.println("Book title: " + title + ".\nPage count: " + page + ".\nBook type: " + type + ".\nCurrent page: " + currentPage);
    
    if (isHardCover()) {
        System.out.println("Cover: Hard Cover");
    } else {
        System.out.println("Cover: Soft Cover");
    }
        }

    
}
