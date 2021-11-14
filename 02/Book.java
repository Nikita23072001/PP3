
public class Book
{
    private String title;
    private int pages;
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setPages(int pages){
        this.pages = pages;
    }
    
    public int getPages(){
        return pages;
    }
    
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setTitle("Kubuś Puchatek");
        book1.setPages(32);
        book2.setTitle("Leń");
        book2.setPages(2);
        System.out.println("Title: "+book1.getTitle()+"\nPages: "+book1.getPages());
        System.out.println("Title: "+book2.getTitle()+"\nPages: "+book2.getPages());
    }
}