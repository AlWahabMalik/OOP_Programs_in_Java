   public class Account
{
    String name;
    String account_no;
    double balance;
    String password;
public Account()
{
    name= "Wahab ";
    account_no= "76268";
    balance= 2724.32;
    password=" ";
}
String GetName()
{
    return name;
}
double GetBalance()
{
    return balance; 
}
    public static void main(String[] args)
    {
        Account acc1= new Account();
        Account acc2= new Account();
        
    }
    
}

