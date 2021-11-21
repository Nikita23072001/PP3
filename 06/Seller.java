
public class Seller
{
    // instance variables - replace the example below with your own
    private String name;

    public Seller(String name)
    {
        this.name = name;
    }

    public void sell()
    {
        System.out.println("ok");
    }
    
    public static void main(String[] args){
        Seller seller = new Seller("Zabka");
        
        seller.sell();
    }
}
