
/**
 * Keeps track of a bank account
 *
 * @author Faustina Bui
 * @version July 18 2023
 */
public class BankAccount
{
    private int id;
    private String name;
    private double balance;
    private static int lastID = 1000;

    /**
     * Constructor for objects of class BankAccount
     * @param newName the new name for the account
     */
    public BankAccount(String name)
    {
        lastID++;
        this.id = lastID;
        this.name = name;
        this.balance = 0;
    }
    
    /**
     * gets the account id of this BankAccount
     * @return the id
     */
    public int getID()
    {
        return id;
    }
    /**
     * gets the balance of this BankAccount
     * @return the balance
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * gets the name of this BankAccount
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    /** 
     * sets a new name for this BankAccount
     * @param newName the new name for the account
     */
    public void setName(String newName)
    {
         name = newName;
    }
    /**
     * deposits an amount into this BankAccount
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance += amount;
    }
    /**
     * withdraws an amount from this BankAccount
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }
}