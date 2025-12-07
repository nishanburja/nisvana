
/**
 * Write a description of class Literalpractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Literalpractice
{// Question 5 : Literal Practice
    
    public static void main(String[] args) {

        // Long literal requiring 'L' suffix
        long longNumber = 9876543210L;

        // Float literal requiring 'f' suffix
        float floatNumber = 12.34f;

        // Char literal using Unicode escape sequence for © symbol
        char copyrightSymbol = '\u00A9';

        // Output the values
        System.out.println("Long value: " + longNumber);
        System.out.println("Float value: " + floatNumber);
        System.out.println("Unicode Character (©): " + copyrightSymbol);
    }
}
