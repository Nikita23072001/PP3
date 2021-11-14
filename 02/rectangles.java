
public class rectangles
{
    public int x;
    public int y;
    

    public rectangles(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int perimeter()
    {
        int perimeter = (x+y)*2;
        return perimeter;
    }
    
    public int surfaceArea(){
        int surfaceArea = x*y;
        return surfaceArea;
    }
    
    public String toString(){
        return ("dimensions:"+x+", "+y+"\nPerimeter:"+perimeter()+"\nSurface Area: "+surfaceArea());
    }
    
    public static void main(String[] args){
        rectangles rect1 = new rectangles(3, 4);
        rectangles rect2 = new rectangles(2, 7);
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
    }
}
