
public class Publisher
{
    private String name;
    private String city;
    
    public Publisher()
    {
        this.name = "Nidus";
        this.city = "Krakow";
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
}
