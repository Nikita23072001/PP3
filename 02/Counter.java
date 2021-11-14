
public class Counter
{
    private int counter;

    public Counter()
    {
        counter = 0;
    }
    
    public void increase(){
        counter += 1;
    }
    
    public void decrease(){
        counter -= 1;
    }
    
    public void increase10(){
        counter += 10;
    }
    
    public void decrease10(){
        counter -= 10;
    }
    
    public void reset(){
        counter = 0;
    }

    public static void main(String[] args){
        Counter count1 = new Counter();
        Counter count2 = new Counter();
        count1.increase10();
        count1.increase10();
        count1.increase();
        count1.increase();
        count1.increase();
        count2.decrease10();
        count2.decrease10();
        count2.decrease10();
        count2.decrease10();
        count2.decrease();
        count2.decrease();
        count2.decrease();
        count2.decrease();
        count2.decrease();
        count2.decrease();
        count2.decrease();
        System.out.println(count1.counter);
        System.out.println(count2.counter);
    }
}
