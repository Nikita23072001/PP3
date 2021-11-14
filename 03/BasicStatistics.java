public class BasicStatistics {
    public static int itemsWithinRange(int start, int end){
        return end-start+1;
    }
    public static int Sum(int start, int end){
        return (start+end)/2*(end-start+1);
    }
    public static float Mean(int start, int end){
        return (start+end)/2;
    }
}
