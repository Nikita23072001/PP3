
public class Chapter
{
    // instance variables - replace the example below with your own
    private int pages;
    private int startingPage;
    private String title;

    public Chapter(String title, int pages, int startingPage)
    {
        this.pages = pages;
        this.title = title;
        this.startingPage = startingPage;
    }
    
    public String info()
    {
        return ("Chapter: "+title+"Pages: "+pages+"Start from: "+startingPage);
    }
}
