import java.util.Scanner;

/**
 * Write a description of class week_5Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week_5Q7
{
     public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    int count = 0;
        
    System.out.println("╔══════════════════════════════════════╗");
    System.out.println("║      EXTENDED CALCULATOR             ║");
    System.out.println("╚══════════════════════════════════════╝");
        
        while(running)
        {
            count++;
            System.out.println("\n─── Calculation " + count + " ──────────────────");
            
            System.out.print("Number 1: ");
            double n1 = sc.nextDouble();
            
            System.out.print("Number 2: ");
            double n2 = sc.nextDouble();
            
            System.out.println("\nAvailable Operations:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (^)");
            
            System.out.print("\nEnter operation number or symbol: ");
            String opInput = sc.next();
            
            double result = 0;
            String operation = "";
            
            
            if(opInput.equals("1") || opInput.equals("+")) {
                result = n1 + n2;
                operation = "Addition";
            }
            else if(opInput.equals("2") || opInput.equals("-")) {
                result = n1 - n2;
                operation = "Subtraction";
            }
            else if(opInput.equals("3") || opInput.equals("*")) {
                result = n1 * n2;
                operation = "Multiplication";
            }
            else if(opInput.equals("4") || opInput.equals("/")) {
                if(n2 != 0) {
                    result = n1 / n2;
                    operation = "Division";
                } else {
                    System.out.println("Cannot divide by zero!");
                    continue;
                }
            }
            else if(opInput.equals("5") || opInput.equals("%")) {
                if(n2 != 0) {
                    result = n1 % n2;
                    operation = "Modulus";
                } else {
                    System.out.println("Cannot calculate modulus with zero!");
                    continue;
                }
            }
            else if(opInput.equals("6") || opInput.equals("^")) {
                result = Math.pow(n1, n2);
                operation = "Power";
            }
            else {
                System.out.println("Invalid operation!");
                continue;
            }
            
            
            System.out.println("\n┌────────────────────────────────────────┐");
            System.out.println("  │            RESULT                      │");
            System.out.println("  ├────────────────────────────────────────│");
            System.out.println("  │ %-15s: %12.2f %c %-6.2f │\n" + operation + n1 +
                            opInput.charAt(0) + n2);
            System.out.println("  │ Result:            %18.2f │\n" + result);
            System.out.println("  └────────────────────────────────────────┘");
            
            System.out.print("\nContinue? (Y/N): ");
            String response = sc.next();
            
            if(response.equalsIgnoreCase("N")) {
                running = false;
            }
    }
}
}