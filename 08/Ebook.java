
public class Ebook extends Book
{
    private String fileName;
    
    public Ebook(String fileName, String title, String authorname, String authorsurname, char genre, int publicYear){
        super(title, authorname, authorsurname, genre, publicYear);
        this.fileName = fileName;
    }
    
    public String getFileName(){
        return fileName;
    }
    
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    public void display(){
        System.out.println("Tytuł: "+super.getTitle()+" Autor: "+super.getAuthor()+" Nazwa pliku: "+getFileName());
    }
}
