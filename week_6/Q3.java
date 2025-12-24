package week_6;
import java.util.Scanner;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[] args)
    {
        String[] students= {"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
        for (int i= 0; i< students.length; i++)
        {
            System.out.println(students[i]);
        }
        System.out.println(students[2]);
        
        students[4]= "Nishan";
        System.out.println(students[4]);
        
        Scanner scan= new Scanner(System.in);
        int index = scan.nextInt();
        String student = scan.next();
        
        
        students[index]= student;
        
        for (int i=0; i<students.length; i++)
        {
            System.out.println(students[i]);
        }
    }
}