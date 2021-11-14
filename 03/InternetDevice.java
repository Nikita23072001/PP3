public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices = 0;

    public InternetDevice(String name){
        this.name = name;
        connected = false;
        connectedDevices++;
    }
    public void connect(){
        connected = true;
    }
    public void disconnect(){
        connected = false;
    }
    public boolean isConnected(){
        return connected;
    }
    public void displayStatus(){
        System.out.println(name + " is " + (connected? "connected":"not connected") );
    }
    public static void displayConnections(){
        System.out.println(connectedDevices);
    }
}
