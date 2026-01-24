package Week12;
import java.util.ArrayList;
import java.util.*;


/**
 * Write a description of class Task2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task2
{
    public static void main(String[] args)
    {
        ArrayList<String> name=new ArrayList();
        name.add("Rochak");
        name.add("pratyush");
        System.out.println(name);
        
        ArrayList<Integer> number=new ArrayList();
        number.add(12);
        number.add(14);
        System.out.println(number);
        
        for(String task2:name)
        {
            System.out.println(name);
        }
        
        for (int task2:number)
        {
            System.out.println(number);
        }
        
        Iterator<String> itr=name.iterator();
        while(itr.hasNext()){
            String fm =itr.next();
            System.out.println(fm);
        }
        
        Iterator<Integer> it=number.iterator();
        while(itr.hasNext()){
            int marks=it.next();
            System.out.println(marks);
        }
    }
}