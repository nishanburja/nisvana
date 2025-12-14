import java.util.Scanner;

/**
 * Write a description of class week_5Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week_5Q8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("   MULTIPLICATION TABLE GENERATOR   ");
        System.out.println("======================================");
        
        System.out.print("Enter a number: ");
        
        try {
            int number = scanner.nextInt();
            
            System.out.println("\nMultiplication Table of " + number + ":");
            System.out.println("-----------------------------");
            
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                
                System.out.printf("%2d × %2d = %3d\n", number, i, result);
            }
            
            System.out.println("-----------------------------");
            
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer!");
        } 
        }
    }


