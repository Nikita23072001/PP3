import java.util.ArrayList;

public class Logic
{
    private boolean[] array;
    private int number=0;

    public Logic(boolean[] args)
    {
        this.array = args;
    }

    public int opposite()
    {
        for(int i = 1; i < array.length-1; i++){
            if(array[i]==true && array[i-1]==false && array[i+1]==false){
                number+=1;
            }else if(array[i]==false && array[i-1]==true && array[i+1]==true)
            {
                number+=1;
            }
        }
        return number;
    }
    
    public static void main(String[] args){
        boolean[] b1 = {true, false, true,true,false,true,false};
        Logic log = new Logic(b1);
        
        System.out.println(log.opposite());
        
        
    }
}
