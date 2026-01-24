package Week12;
import java.util.ArrayList;


/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
    public static void main(String [] args)
    {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student ("Ayush", "L1N1", 9876543210l));
        students.add(new Student ("Rahul", "L1M1", 9876543211l));
        students.add(new Student ("Gaurav", "L1N1", 9876543212l));
        
        System.out.println(students.get(0));
        
        for(Student std :students)
        {
            System.out.println(std);
        }
        
        //conventional for loop
        for(int i=0; i< students.size(); i++)
        {
            if(students.get(i).getName().equals("Gaurav"))
            {
                students.remove(i);
            }
        }
        
        for(int i=0; i< students.size(); i++)
        {
            if(students.get(i).getName().equals("Rahul"))
            {
                students.get(i).setGroup("L1N1");
            }
        }
    }
}