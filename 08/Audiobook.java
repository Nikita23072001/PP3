
public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    public Audiobook(int minutes, int seconds, String title, String authorname, String authorsurname, char authorgenre, int publicYear){
        super(title, authorname, authorsurname, authorgenre, publicYear);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int getMinutes(){
        return minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public void display(){
        System.out.println("Tytuł: "+getTitle()+" Autor: "+getAuthor()+" Czas trwania: "+getMinutes()+" minut "+getSeconds()+" sekund");
    }
}
