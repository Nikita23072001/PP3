
/**
 * Write a description of class BestBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BestBook
{
    // instance variables - replace the example below with your own
    private String type;
    private String name;
    private int pages;
    private int place;

    public BestBook(String type, String name, int pages, int place)
    {
        this.type = type;
        this.name = name;
        this.pages = pages;
        this.place = place;
    }

    public void find()
    {
        System.out.println("Your book is on place: "+place);
    }
    
    public void open(){
        System.out.println("Book is opened");
    }
    
    public void close(){
        System.out.println("Book is closed");
    }
}
