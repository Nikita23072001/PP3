public class Room
{
    // Room atributes
    int number;
    String beds;
    boolean occupied;
    String guestName;
    
    //Room methods    
    public Room(int number)
    {
        this.number = number;
        this.beds = "2";
    }
    
    public Room(int number, String beds){
        this.number = number;
        this.beds = beds;
    }
    
    public void checkin(String guestName){
        guestName = guestName;
        occupied = true;
    }
    
    public void checkout(){
        guestName = null;
        occupied = false;
    }
    
    public boolean isOccupied(){
        return occupied;
    }
    
    public void displayStatus(){
        System.out.println("Room: "+ number +" beds: "+beds+" Occupied: "+isOccupied()+" Guest: "+guestName);
    }
    
    public static void main(String args[]){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4,"3");
        rooms[4] = new Room(5,"3");
        rooms[5] = new Room(6,"1");
        
        rooms[0].displayStatus();
        rooms[4].displayStatus();
    }
}
