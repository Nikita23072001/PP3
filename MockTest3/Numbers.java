
public class Numbers implements Ok
{
    private int[] array;
    private boolean result;

    public Numbers(int[] arr)
    {
        this.array = arr;
    }
    
    public boolean ok()
    {
        for(int i = 0; i < array.length; i++){
            if(i%2==0 && array[i]%2==0){
                result = true;
            }else if(i%2!=0 && array[i]%2!=0){
                result = true;
            }else{
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] a1 = {6,7,6,1,4};
        int[] a2 = {4,7,4,2,4};
        Numbers num = new Numbers(a1);
        
        System.out.println(num.ok());
    }
}
