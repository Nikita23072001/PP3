
/**
 * Write a description of class Comp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comp
{
    private boolean working;
    private RamMemory ram;
    private Graphics graph;
    private Keyboard keyboard;

    public Comp(int amount, String graphModel, float graphFrequency, String keyboardModel, boolean lighting)
    {
        ram = new RamMemory(amount);
        graph = new Graphics(graphFrequency, graphModel);
        keyboard = new Keyboard(keyboardModel, lighting);
    }

    public void isOn(){
        working = true;
    }
    
    public void isOff(){
        working = false;
    }
    
    public void showInfo()
    {
        System.out.println("Computer working: "+working+ram.showInfo()+graph.showInfo()+keyboard.showInfo());
    }
    
    public static void main(String[] args){
        Comp comp = new Comp(8192, "Nvidia XTX 5900", 4.99f, "Logitech G202", true);
        
        comp.showInfo();
    }
}
