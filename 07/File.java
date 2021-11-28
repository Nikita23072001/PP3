
public class File
{
    private String name;

    public File(String name)
    {
        this.name = name;
    }

    public void rename(String name)
    {
        this.name = name;
    }
    
    public String displayInfo(){
        return name;
    }
}
