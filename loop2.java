
/**
 * Write a description of class loop2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loop2
//Q-3
{
    public static void main(String[] args){
    int i=1;
    int sum= 0;
    do{
        sum = sum + (i * i);
        i++;
    
      }while (i <= 10);
      System.out.println("Sum of squres of first natural numbers =" + sum);
}
}