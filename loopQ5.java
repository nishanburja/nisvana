
/**
 * Write a description of class loopQ5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loopQ5
{
    public static void main(String[] args)
    {
        for (int i= 1; i <= 5; i++)
        {
            for(int j= 5; j >= i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k <= i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}