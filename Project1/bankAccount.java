
public class bankAccount
{
    int balance;
    String name;
    boolean cardexist;
    String cardNumber;
    String clientNumber;
    
    public void showClient()
    {
        System.out.println("Client name:"+name);
        System.out.println("Number:"+clientNumber);
        System.out.println("Balance:"+balance);
    }
    
    public int addtobalance(){
        balance=balance+50;
        return balance;
    }
}
