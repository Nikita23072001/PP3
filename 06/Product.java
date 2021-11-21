
public class Product
{
    // instance variables - replace the example below with your own
    private float price;
    private String name;
    
    public Product(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public String displayInfo()
    {
        return (name + price);
    }
    
    public static void main(String[] args){
        Product product = new Product("Mleko", 5.00f);
        System.out.println(product.displayInfo());
    }
}
