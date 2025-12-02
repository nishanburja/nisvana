
/**
 * Write a description of class InstCt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InstCt
{
    int age; // instance variable
    static int qty; // static variable  // class reference 
    
    public static void main(String[] args)
    {
       int a=10; // local variable
       System.out.println(a);
    
       // <className> <variable>= new <className>();
       InstCt obj=new InstCt(); // instance
       
       System.out.println(InstCt.qty); // static
       System.out.println(obj.age); // value default
       
       
       
       
       
       
    }
}