
/**
 * Write a description of class headphones here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class headphones
{
    // instance variables - replace the example below with your own
    private String name;
    private String model;
    private boolean isMono;
    private boolean microphone;
    private int decibels;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setMono(boolean isMono){
        this.isMono = isMono;
    }
    
    public void setMicrophone(boolean microphone){
        this.microphone = microphone;
    }
    
    public void setDecibels(int decibels){
        this.decibels = decibels;
    }
    
    public String getName(){
        return name;
    }
    
    public String getModel(){
        return model;
    }
    
    public boolean getMono(){
        return isMono;
    }
    
    public boolean getMicrophone(){
        return microphone;
    }
    
    public int getDecibels(){
        return decibels;
    }
    
    
}
