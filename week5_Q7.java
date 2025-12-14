import java.util.Scanner;

/**
 * Write a description of class week5_Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_Q7
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter a number: ");
   int a = sc.nextInt();
   
   System.out.println("Enter second number: ");
   int b = sc.nextInt();
   
   System.out.println("Choose a Arithematic operation(+,-,*,/): ");
   char op = sc.next().charAt(0);
   
   int sum;
   int diff;
   int mult;
   int div;
   
   switch(op)
   {
       case '+':
           sum = a + b;
       break;
       
       case '-':
           diff = a - b;
       break;
       
       case '*':
           mult = a * b;
       break;
       
       case '/':
           div = a/b;
       break;
       
       default:
           System.out.println("Choose a correct operator");
   }
 }
}
