import java.util.Scanner;
/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int grade= scanner.nextInt();
        String result= (grade>= 40) ? "Pass":"Fail";
        System.out.println(result);
        
    }
}