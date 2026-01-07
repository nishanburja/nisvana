package week_8;


/**
 * Write a description of class Electricitytest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Electricitytest
{
     public static void main(String[] args) 
    {
        // Create ElectricityBill 
        ElectricityBill bill = new ElectricityBill("Nitesh", 99);

        // Display bill details
        System.out.println("Consumer Name: " + bill.getconsumerName());
        System.out.println("Units Consumed: " + bill.getunitsConsumed());
        System.out.println("Total Bill Amount: " + bill.calculateBill());
    }
}