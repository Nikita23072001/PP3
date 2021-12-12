
public class Writer
{
    private String name;
    private String surname;
    private char genre;

    public Writer(String name, String surname, char genre)
    {
        this.name = name;
        this.surname = surname;
        this.genre = genre;
    }

    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getGenre(){
        return (""+genre);
    }
}
