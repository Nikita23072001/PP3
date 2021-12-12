import java.util.ArrayList;

public class Library
{
    private static ArrayList<Book> array;
    
    public static void display(){
        for(int i = 0; i < array.size(); i++){
            array.get(i).display();
        }
    }
    
    public static void main(String[] args){
        array = new ArrayList<Book>();
        Book book1 = new Book("Tytuł", "Jan", "Kowalski", 'M',2013);
        Book book2 = new Ebook("Ebook", "Ebook.txt", "Jan", "Kowalski", 'M', 2014);
        Book book3 = new Ebook("Ebook2", "Ebook2.txt", "Jan", "Kowalski", 'M', 2015);
        Book book4 = new Audiobook(23, 39, "Audiobook", "Jan", "Kowalski", 'M', 2015);
        Book book5 = new Audiobook(25, 45, "Audiobook2", "Jan", "Kowalski", 'M', 2016);
        
        array.add(book1);
        display();
        array.add(book3);
        array.add(book2);
        display();
        array.add(book4);
        array.add(book5);
        display();
        
    }
}
