
public class Customer
{
    private String name;
    private String productName;

    public Customer(String name)
    {
        this.name = name;
    }

    public void buy(String name)
    {
        System.out.println("Ok");
    }
    
    public static void main(String[] args){
        Customer customer = new Customer("Jan Kowalski");
        
        customer.buy("Smth");
    }
}
