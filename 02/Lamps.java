public class Lamps
{
    private boolean lampIsOn;

    public Lamps(){
    }

    public boolean switchOn()
    {
        this.lampIsOn = true;
        return lampIsOn;
    }
    
    public boolean switchOff(){
        this.lampIsOn = false;
        return lampIsOn;
    }
    
    public void displayInfo(){
        System.out.println(this.lampIsOn);
    }
    
    public static void main(String[] args){
        Lamps lamp1 = new Lamps();
        Lamps lamp2 = new Lamps();
        lamp1.switchOn();
        lamp2.switchOff();
        lamp1.displayInfo();
        lamp2.displayInfo();
    }
}
