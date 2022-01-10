
public class Isogram
{
    private static String str;
    private static int fal=0;
    
    public static void isogram(String n)
    {
        outloop:
        for(int i = 0; i < n.length(); i++){
            for(int j = 0; j < n.length(); j++){
                if(i != j){
                    if(n.charAt(i) == n.charAt(j)){
                        fal += 1;
                        break outloop;
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }
        }
        if(fal!=0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
    
    public static void main(String[] args){
        Isogram iso = new Isogram();
        
        isogram("tv set");
    }
}
