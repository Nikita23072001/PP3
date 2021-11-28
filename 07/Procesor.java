
/**
 * Write a description of class Procesor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Procesor
{
    // instance variables - replace the example below with your own
    private float speed;
    private int cashSize;
    private int numberOfCores;

    public Procesor(float speed, int cashSize, int numberOfCores)
    {
        this.speed = speed;
        this.cashSize = cashSize;
        this.numberOfCores = numberOfCores;
    }

    public int add(int x, int y)
    {
        // put your code here
        return x + y;
    }
    
    public int multiply(int x, int y){
        return x*y;
    }
    
    public String showProcSpecs(){
        return (" Procesor speed: "+speed+" Cash: "+cashSize+" Cores: "+numberOfCores);
    }
    
}
