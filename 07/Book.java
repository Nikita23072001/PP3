
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private int pages;
    private int acts;
    private Writer author;
    private Chapter chapter1;

    public Book(String title, int acts, int pages, String name, int age, String chapterTitle, int chapterPages, int startingPage)
    {
        this.author = new Writer(name, age);
        this.pages = pages;
        this.acts = acts;
        this.title = title;
        this.chapter1 = new Chapter(chapterTitle, chapterPages, startingPage);
    }

    public String showInfo()
    {
        return ("Title: "+title+" Pages: "+pages+" Acts: "+acts+" Author "+author.info()+"Chapter info: "+chapter1.info());
    }
    
    public static void main(String[] args){
        Book book = new Book("Coś", 15, 25, "Nikita", 45, "Pierwsza", 3, 2);
        System.out.println(book.showInfo());
    }
}
