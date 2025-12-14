import java.util.Scanner;

/**
 * Write a description of class week_5Qsenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week_5Qsenario
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   NEPAL INVESTMENT BANK - FIXED DEPOSIT      ║");
        System.out.println("║          Monthly Compounding Calculator      ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        
        System.out.println("\nAVAILABLE INTEREST RATES:");
        System.out.println("───────────────────────────");
        System.out.println(" 1 Year:  8.00% - 9.00%");
        System.out.println(" 2 Years: 8.50% - 9.50%");
        System.out.println(" 3 Years: 9.00% - 10.00%");
        System.out.println(" 4 Years: 9.50% - 10.50%");
        System.out.println(" 5 Years: 10.00% - 11.00%");
        System.out.println(" Senior Citizen: +0.5% extra");
        System.out.println("───────────────────────────");
        
        boolean another = true;
        
        while (another)
        {
            System.out.println("\n► ENTER FD DETAILS:");
            System.out.print("  Principal (Rs.): ");
            double P = sc.nextDouble();
            
            if (P < 1000)
            {
                System.out.println("Minimum deposit is Rs. 1,000");
            }
            
            System.out.print("  Annual Rate (8-12%): ");
            double R = sc.nextDouble();
            
            if (R < 8 || R > 12)
            {
                System.out.println("Rate must be between 8% and 12%");
            }
            
            System.out.print("  Duration (1-5 years): ");
            int T = sc.nextInt();
            
            if (T < 1 || T > 5)
            {
                System.out.println("Duration must be 1-5 years");
            }
            
            
            double r = R / 100 / 12;
            int n = T * 12;          
            
            
            double A = P * Math.pow(1 + r, n);
            
            
            double fee = A * 0.005;
            double finalAmt = A - fee;
            
            
            System.out.println("\n┌────────────────────────────────────────────┐");
            System.out.println  ("│           FD CALCULATION SUMMARY           │");
            System.out.println  ("├────────────────────────────────────────────┤");
            System.out.println  ("│ Deposit Amount:      Rs. %12.2f     │\n"+ P);
            System.out.println  ("│ Interest Rate:           %6.2f%%           │\n"+ R);
            System.out.println  ("│ Duration:                %3d years         │\n"+ T);
            System.out.println  ("├────────────────────────────────────────────┤");
            System.out.println  ("│ Maturity Amount:    Rs. %12.2f      │\n"+ A);
            System.out.println  ("│ Processing Fee:     Rs. %12.2f      │\n"+ fee);
            System.out.println  ("├────────────────────────────────────────────┤");
            System.out.println  ("│ FINAL AMOUNT:       Rs. %12.2f      │\n" + finalAmt);
            System.out.println  ("└────────────────────────────────────────────┘");
            
        }
    }
}
