
public class Product
{
    // instance variables - replace the example below with your own
    private String productName;
    private boolean isVegetarian;

    public void setProductName(String productName, boolean isVegetarian){
        this.productName = productName;
        this.isVegetarian = isVegetarian;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public boolean getVegetarian(){
        return isVegetarian;
    }
    
    public String toString(){
        return ("Name: "+getProductName()+"\nCzy jest Wege: "+getVegetarian());
    }
}
