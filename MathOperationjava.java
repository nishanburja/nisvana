
/**
 * Write a description of class MathOperationjava here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperationjava
{
    public static void main(String [] args){
    // 1.Arthmetic
    
    int num1= 14;
    int num2= 24;
    
    int sum= num1 + num2;
    int diff= num2 - num1;
    int mult= num1 * num2;
    int div= num1 / num2;
    int remain= num1 % num2;
    
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(mult);
    System.out.println(div);
    System.out.println(remain);
    
    //2.Unary(post-increment and pre-increment operation)
    
    int num3= 1;
    // Post-increment
    System.out.println(num3); // num3= 1
    System.out.println(num3++); // num3++= 1 num3= 2
    System.out.println(num3); // num3= 2
    
    // Pre-increment
    System.out.println(++num3); // ++num3= 3, num3= 3
    System.out.println(num3); // num3= 3
    
    // relational Operator
    
    float a = 8;
    float b = 6;
    
    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);
    
    // Logical Operator
    
    int c= 4;
    int d= 3;
    
    System.out.println(c < d && c < d);
    System.out.println(c < d || c > d);
    System.out.println(!(c > d));
    
    
}
}