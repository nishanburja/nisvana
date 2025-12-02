import java.util.Scanner;

/**
 * Write a description of class project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class project
{     
  public static void main(String[] args )
{  
    /*
  System.out.println("It is our first week of programming.");
  System.out.println("It is easier to learn");
  System.out.println("My name is NIshan Burja");
  
  
  
  int age= 18;
  System.out.println(age);
  
  
  double weight= 74.60;
  System.out.println(weight);
  
  String name="Nishan Burja";
  System.out.println(name);
  
  boolean isPassed= true;
  System.out.println(isPassed);
  
  // Arithmetic Operator
  
  int num1= 10;
  int num2= 11;
  
  int sum= num1+num2;
  System.out.println(sum);
  
  int difference= num2 - num1;
  System.out.println(difference);
  int multification= num1 * num2;
  System.out.println(multification);
  
  int division= num2 / num1;
  System.out.println(division);
  int remainder= num2 % num1;
  System.out.println(remainder);
  
  // Relational Operator 
  
  System.out.println(num1 == num2); // false
  System.out.println(num1 != num2); //true
  System.out.println(num1 > num2); // false
  System.out.println(num1 < num2); //true
  System.out.println(num1 >= num2); // false
  System.out.println(num1 <= num2); // true
  
  // Pre-increment and post-increment operator
  
  int h= 1;
  
  System.out.println(h); // h=1
  
  System.out.println(++h); // h=2
  System.out.println(h); // h=2
  System.out.println(h++); // h=3
  System.out.println(h); // h=3
  
  int m= 10; // m=10 
  int k= m++; // k=10, m=11
  int n= ++m; // n=12,m=12
  System.out.println(m+k+n);
  
  int s= 10; // s=10
  int t= --s; // s=9,t=9
  int r= s--; // r=9,s=8
  System.out.println(s + t + r);
  
  // Use scanner class
  
  Scanner scan= new Scanner(System.in);
  
  System.out.println("Enter your first number");
  
  int num4 = scan.nextInt();
  System.out.println("My first number is: "+ num4);
  
  double num5 = scan.nextDouble();
  System.out.println(num5);
  
  scan.nextLine();
  
  System.out.println("Enter your name");
  
  String namee= scan.nextLine();
  System.out.println("My name is: "+ namee);
  
  */
 
  // Ternery Operator
  
  Scanner scan= new Scanner(System.in);
  System.out.println("What is your age?");
  
  int ageee= scan.nextInt();
  
  String isEligible= (ageee >= 18)? "Driving is allowed" : "Driving is not allowed";
  System.out.println(isEligible);
  
  
}}