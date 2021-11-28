import java.util.ArrayList;

public class Folder
{
    static ArrayList<Object> folder = new ArrayList<Object>();
    
    public void displayContent(){
        System.out.println(folder);
    }
    
    public void remove(String name){
        for(int i = 0; i < folder.size(); i++){
            if (name == folder.get(i)){
                folder.remove(i);
            }
        }
    }
    
    public static void main(String[] args){
        File file1 = new File("pierwszy");
        File file2 = new File("drugi");
        
        folder.add(file1.displayInfo());
        folder.add(file2.displayInfo());
        
        System.out.println(folder);
        
        File file3 = new File("trzeci");
        
        folder.add(file3.displayInfo());
        System.out.println(folder);
        folder.remove("trzeci");
        System.out.println(folder);
       
        
        
    }
}
