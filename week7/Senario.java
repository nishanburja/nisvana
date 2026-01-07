package week7;


/**
 * Write a description of class Senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Senario
{
    public static void main(String[] args)
    {
        BankAccount acc1 = new BankAccount(888, "Nishan", 4800000);
        BankAccount acc2 = new BankAccount(36, "Manoj", 1200000);
        
         acc1.deposit(20000);
        acc1.withdraw(30000);
        
        acc2.deposit(50000);
        acc2.withdraw(40000);
        
        System.out.println("\nFinal Account Details:\n");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}