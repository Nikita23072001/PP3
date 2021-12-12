
public class Book
{
    private String title;
    private Writer author;
    private Publisher publisher;
    private int publicYear;
    
    public Book(String title, String authorname,String authorsurname, char genre,int publicYear){
        this.title = title;
        this.author = new Writer(authorname, authorsurname, genre);
        this.publisher = new Publisher();
        this.publicYear = publicYear;
    }
    
    public void display(){
        System.out.println("Tytuł: "+title+getAuthor()+" Wydawnictwo "+publisher.getName()+" w "+publisher.getCity());
    }
    
    public String getAuthor(){
        return (" Author: "+author.getName()+" "+author.getSurname()+" "+author.getGenre());
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setPublicYear(int publicYear){
        this.publicYear = publicYear;
    }
    
    public String getPublicYear(){
        return (""+publicYear);
    }
    
    public static void main(String[] args){
        Book book3 = new Ebook("Coś", "Coś.txt", "Jan", "Kowalski", 'M', 13);
    }
}
