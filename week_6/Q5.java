package week_6;
import java.util.Scanner;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[] args)
    {
        String[] district= {"Morang","Kathmandu","Kaski","sindhuli"};
        
        for(int i=0; i< district.length; i++)
        {
            System.out.println((i+1) + "." + district[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = sc.nextInt();
        
        for(int i=0; i<len; i++)
        {
            System.out.println(district[i]);
        }
    }
}