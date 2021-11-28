import java.util.ArrayList;

/**
 * Write a description of class BookCase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookCase
{
    static ArrayList<Object> bookcase;

    public static void displayContent(){
        System.out.println(bookcase);
    }
    
    public void remove(int x){
        bookcase.remove(x);
    }
    
    public static void main(String[] args){
        bookcase = new ArrayList<Object>();
        Book book1 = new Book("Coś", 15, 25, "Nikita Gordynski", 45, "Pierwszy", 3, 2);
        
        bookcase.add(book1);
        
        displayContent();
        
    }
}
