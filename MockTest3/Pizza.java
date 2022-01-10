
public class Pizza extends Food implements Extra
{
    private int size;
    private float discount;
    private int delivery;

    public Pizza(String name, int size)
    {
        super(name);
        this.size = size;
    }
    
    public void setPrice(){
        super.setPrice(size-10);
    }
    
    public float discount(){
        if(super.getPrice()>=30){
            discount = getPrice()*0.05f;
        }
        return discount;
    }
    
    public float delivery(){
        if(size>=50){
            return 8f;
        }else{
            return 6f;
        }
    }
    
    public float delivery(int size){
        return size;
    }
    
    public static void main(String[] args){
        Pizza piz = new Pizza("Extra", 35);
        
        piz.setPrice();
        System.out.println(piz.getPrice());
        System.out.println(piz.discount());
        System.out.println(piz.delivery());
        System.out.println(piz.delivery(4));
    }
}
