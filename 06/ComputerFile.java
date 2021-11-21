
public class ComputerFile
{
    // instance variables - replace the example below with your own
    private String name;
    private String path;
    private int size;
    private String type;
    private boolean hidden;

    public ComputerFile(String name, boolean hidden, String type, String path)
    {
        this.name = name;
        this.path = path;
        this.type = type;
        this.hidden = hidden;
    }

    public void rename(String name)
    {
        this.name = name;
    }
    
    public void changeVisibility(boolean hidden){
        this.hidden = hidden;
    }
    
    public void changeType(String type){
        this.type = type;
    }
}
