
/**
 * Write a description of class Computer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computer
{

    private int ram;
    private Procesor cpu;
    private String gpu;

    /**
     * Constructor for objects of class Computer
     */
    public Computer(int ram, float speed, int cashSize, int numberOfCores, String gpu)
    {
        this.cpu = new Procesor(speed, cashSize, numberOfCores);
        this.ram = ram;
        this.gpu = gpu;
    }

    public void showHelloWorld()
    {
        System.out.println("Hello World");
    }
    
    public void showSpecs(){
        System.out.println("Ram: "+ram+" Prcesor: "+cpu.showProcSpecs()+" GPU: "+gpu);
    }
    
    public static void main(String[] args){
        Computer comp = new Computer(8192, 3.00f, 8, 6, "Geforce RTX 5090");
        
        comp.showSpecs();
    }
}
