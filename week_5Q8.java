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
        Scanner reader = new Scanner(System.in);
        
        System.out.println("MULTIPLICATION TABLE (1-10)");
        System.out.println("============================");
        
        System.out.print("Enter number: ");
        int n = reader.nextInt();
        
        System.out.println("\nFormat 1: Simple");
        System.out.println("----------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        
        System.out.println("\nFormat 2: Formatted");
        System.out.println("-------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d × %2d = %3d\n", n, i, n * i);
        }
        
        System.out.println("\nFormat 3: In Line");
        System.out.println("-----------------");
        for (int i = 1; i <= 10; i++) {
            System.out.print((n * i) + " ");
        }
        
        reader.close();
    }
}
