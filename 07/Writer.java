
public class Writer
{
    // instance variables - replace the example below with your own
    private String name;
    public int age;
    
    
    public Writer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String info()
    {
        return (" Name "+name+" Age: "+age);
    }
}
