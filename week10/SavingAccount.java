package week10;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends Account
{
     public SavingAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    // Override method
    @Override
    public double calculateInterest() {
        super.calculateInterest();
        return balance * 0.05; // 5% interest
    }

    // Overloaded method
    public double calculateInterest(double rate) {
        return balance * rate;
    }
}