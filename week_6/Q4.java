package week_6;
import java.util.Scanner;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String[] srgs)
    {
        int[] scores= {10,20,30,40,50};
        int sum= 0;
        int avg= 0;
        int highest= scores[0];
        int lowest= scores[0];
        for (int i= 0; i<scores.length; i++)
        {
        System.out.println(scores[i]);
        sum = sum+scores[i];
        if(scores [i] > highest)
        {
            highest= scores[i];
        }
        if(scores[i]< lowest)
        {
            lowest = scores[i];
        }
    }
        System.out.println("lowest:" + lowest);
        System.out.println("highest:" + highest);
        
        avg= sum/(scores.length);   
        
        System.out.println(sum);
        System.out.println(avg);
        Scanner sc = new Scanner(System.in);
          int len= sc.nextInt();

          
          
          
         for(int i=0; i< scores.length; i++){
            
            scores[i]= sc.nextInt();
        
         }
         
         for(int i=0; i< scores.length; i++){
             System.out.println("the score is: " + scores[i]);
            
        }

        
        
                      
    }
}