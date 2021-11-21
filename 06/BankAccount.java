
public class BankAccount
{
    // instance variables - replace the example below with your own
    private float balance;

    public BankAccount(int n)
    {
        this.balance = n;
    }

    public void deposit(int n)
    {
        balance += n;
    }
    
    public void withdraw(int n){
        if (n<=500 && n<=balance){
            balance -= n;    
        }else{
            System.out.println("Przekroczenie limitu dziennego lub salda!");
        }
        
    }
    
    public float displayBalance(){
        return balance;
    }
    
    public static void main(String[] args){
        BankAccount ac1 = new BankAccount(0);
        ac1.deposit(500);
        System.out.println(ac1.displayBalance());
        ac1.deposit(200);
        System.out.println(ac1.displayBalance());
        ac1.withdraw(300);
        System.out.println(ac1.displayBalance());
    }
}
