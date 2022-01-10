
public class Person
{
    private String name;
    private String surname;
    
    
    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String toString()
    {
        this.name = name.toUpperCase();
        this.surname = surname.toUpperCase();
        return (""+name.charAt(0)+surname.charAt(0));
    }

    public static void main(String[] args){
        Person per = new Person("anna", "may");
        
        System.out.println(per.toString());
    }
}
