
public class Product implements Comparable<Product>
{
    private String name;
    private float price;

    public Product(String name, float price)
    {
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }

    public int compareTo(Product product)
    {
        return name.compareTo(product.getName());
    }
    
    public static void main(String[] args){
        Product product = new Product("Mleka", 2.50f);
    }
}
