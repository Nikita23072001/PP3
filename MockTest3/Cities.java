
public class Cities
{
    private String[] arr;
    private String result = "";

    public Cities(String[] args)
    {
        arr = args;
    }

    public Cities filter(char s)
    {
        for(String a : arr){
            if(a.charAt(0) == s){
                result += a;
            }
        }
        return this;
    }
    
    public String cities(){
        return result;
    }
    
    public static void main(String[] args){
        String[] arr = {"Warszawa", "Kielce", "Sopot", "Wawry"};
        Cities cit = new Cities(arr);
        
        System.out.println(cit.filter('W').cities());
    }
}
