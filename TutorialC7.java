
/**
 * Write a description of class TutorialC7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TutorialC7
{
    public static void main(String[] args)
{
    // byte, short, long
    System.out.println(Byte.MAX_VALUE); // maximum value
    System.out.println(Byte.MIN_VALUE); // minimum value
    System.out.println(Byte.SIZE); // bits
    System.out.println(Byte.BYTES); // Bytes

    System.out.println(Short.MAX_VALUE); // maximum value
    System.out.println(Short.MIN_VALUE); // minimum value
    System.out.println(Short.SIZE); // size
    System.out.println(Short.BYTES); //  Bytes
    
    System.out.println(Long.MAX_VALUE); // maximum value
    System.out.println(Long.MIN_VALUE); // minimum value
    System.out.println(Long.SIZE); // size
    System.out.println(Long.BYTES); // Bytes
    
    // implicit typecasting --> widering casting
    
    int itr= 10;
    double db= itr;
    
    System.out.println(db);
    
    byte bt= 7;
    short st= bt;
    
    System.out.println(st);
    
    // explicit typecasting --> narrowing typecasting
    
    double dr= 10.08d;
    int it= (int)dr;
    
    System.out.println(it);
    
    long lg= 92233;
    short str= (short) lg;
    
    System.out.println(str);
    
    
    
    // week-4 Q1
    int num= 27;
    
    if (num >= 40)
    {
        System.out.println("Student is pass");
    }
    else
    {
        System.out.println("Student is fail");
    }
    
    
    
    
}
}