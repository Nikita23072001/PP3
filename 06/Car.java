
public class Car
{
    // instance variables - replace the example below with your own
    private String model;

    public Car(String model)
    {
        this.model = model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel(){
        return model;
    }
    
    public static void main(String[] args){
        Car car = new Car("OPEL Zafira");
        
        System.out.println(car.getModel());
        car.setModel("OPEL Astra");
        System.out.println(car.getModel());
    }
}
