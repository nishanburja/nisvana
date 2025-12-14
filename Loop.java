
/**
 * Write a description of class Loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loop
{
    // for, while, do while
    
    // for --> starting, ending 
    
    // intialization --> startinng value => 1, condition checking, increment/ decrement
    
    public static void main(String[] args)
    {
         for(int i=1; i<=5; i++)
         {
             for(int j= 1; j<=i; j++)
             {
                 System.out.print(j);
             }
             
             System.out.println();
         }
    }
}