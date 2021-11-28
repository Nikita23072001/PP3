
public class Keyboard
{
    private String model;
    private boolean lighting;

    public Keyboard(String model, boolean lighting)
    {
        this.model = model;
        this.lighting = lighting;
    }
    
    public void isOn(){
        lighting = true;
    }
    
    public void isOff(){
        lighting = false;
    }

    public String showInfo()
    {
        return (" Model: "+model+" lightning: "+lighting);
    }
}
