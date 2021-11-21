import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{   
    static Scanner sc = new Scanner(System.in);
    
    public static void display(ArrayList<String> list){
        for(String str : list){
            System.out.println(str);
        }
    }
    
    public static void displaySize(ArrayList<String> list){
        int size = list.size();
        System.out.println(size);
    }
    
    public static void enterProduct(ArrayList<String> list){
        list.add(sc.nextLine());
    }
        
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        display(list);
        displaySize(list);
        
        list.add("Milk");
        list.add("Water");
        list.add("Potatos");
        
        display(list);
        displaySize(list);
        
        list.add("Bread");
        
        display(list);
        displaySize(list);
        
        enterProduct(list);
        
        display(list);
        displaySize(list);
    }
}
