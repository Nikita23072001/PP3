
public class Orc
{
    private String fantasySetting;
    private String weapon;
    private String skinColor;
    private String name;
    private int age;
    
    public Orc(String name, int age, String fantasySetting)
    {
        this.weapon = "hands";
        this.name = name;
        this.age = age;
        this.fantasySetting = fantasySetting;
        this.skinColor = "Green";
    }

    public void shout(int y)
    {
        System.out.println("Aaaaaaaaaaaaaaaaa");
    }
    
    public void getWeapon(){
        this.weapon = "Axe";
    }
    
    public void dropWeapon(){
        this.weapon = "hands";
    }
    
    public void describeYourself(){
        System.out.println("My name is: "+name+"\nI'm "+age+"yeas old"+"\nAt this moment my weapon is: "+weapon);
    }
}
