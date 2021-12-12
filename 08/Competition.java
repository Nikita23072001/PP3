import java.util.Arrays;

public class Competition
{
    private int[] arr;
    public Competition(int a, int b, int c, int d, int e)
    {
        int[] arr = {a,b,c,d,e};
    }

    public int result(int y)
    {
        int result = 0;
        arr.sort();
        
        result = arr[1]+arr[2]+arr[3];
        return result;
    }
}
