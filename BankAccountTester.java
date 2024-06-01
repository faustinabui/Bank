
/**
 * Unit tests the BankAccount class
 *
 * @author Faustina Bui
 * @version July 18 2023
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount bob = new BankAccount("Robert");
        System.out.println(bob.getID());
        System.out.println("Expected: 1001");
        System.out.println(bob.getName());
        System.out.println("Expected: Robert");
        System.out.println(bob.getBalance());
        System.out.println("Expected: 0.0");
        bob.setName("Bob");
        System.out.println(bob.getName());
        System.out.println("Expected: Bob");
        bob.deposit(12000);
        System.out.println(bob.getBalance());
        System.out.println("Expected: 12000.0");
        bob.withdraw(1500);
        System.out.println(bob.getBalance());
        System.out.println("Expected: 10500.0");
    }
}