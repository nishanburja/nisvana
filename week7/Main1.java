package week7;


/**
 * Write a description of class Main1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main1
{
    public static void main(String[] args)
    {
        Book book1= new Book();
        Book book2= new Book();
        
        book1.title= "Ek Chihan";
        book1.author= "Hridaya Chandra Singh Pradhan";
        book1.price= 550.50;
        
        System.out.println("Book 1 details");
        System.out.println("Title:"+ book1.title);
        System.out.println("Author:"+ book1.author);
        System.out.println("Price:"+ book1.price);
        
        book2.title= "The Art of Being Alone";
        book2.author= "Renuka Gavrani";
        book2.price= 500; 
        
        System.out.println("Book 2 details");
        System.out.println("Title:"+ book2.title);
        System.out.println("Author:"+ book2.author);
        System.out.println("Price:"+ book2.price);
        
    }
}