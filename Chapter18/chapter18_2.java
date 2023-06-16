import java.util.*;

public class chapter18_2
{
    public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount();
        myAccount.setBalance(0);
        myAccount.deposit(10000);
        
        
        System.out.println("잔액 : "+myAccount.getBalance());
        
        myAccount.withDraw(8000);
        System.out.println("잔액 : "+myAccount.getBalance());
    }   
}

class BankAccount
{
    private int accountNumber, balance;
    private String owner;
    
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    
    public int getBalance()
    {
        return this.balance;
    }
    
    public String getOwner()
    {
        return this.owner;
    }
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    
    public void deposit(int value)
    {
        this.balance += value;
    }
    
    public void withDraw(int value)
    {
        this.balance -= value;
    }
}