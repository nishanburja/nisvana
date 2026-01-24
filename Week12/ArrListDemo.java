package Week12;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class ArrListDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers= new ArrayList<>();
        ArrayList<String> names= new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("numbers:" + numbers);
        
        names.add("Sapana");
        names.add("Samjhana");
        names.add("Anjali");
        names.add("Manoj");
        names.add("Nitesh");
        names.add("Suman");
        
        System.out.println("names:" + names);
        
        for(int ArrListDemo: numbers)
        {
            System.out.println(ArrListDemo);
        }
        
        for(String ArrListDemo: names)
        {
            System.out.println(ArrListDemo);
        }
        
        Iterator<Integer> itr= numbers.iterator();
        
        while(itr.hasNext())
        {
            int marks= itr.next();
            System.out.println(marks);
        }
        
        Iterator<String> it=names.iterator();
        
        while(it.hasNext())
        {
            String name= it.next();
            System.out.println(name);
        }
        
        //remove
        names.remove(2);
        
        //size
        System.out.println(names.size());
        System.out.println(numbers.size());
        
        //clear
        numbers.clear();
        System.out.println(numbers);
        
        //get and set
        System.out.println(names.get(3));
        names.add("Puja");
        System.out.println(names.get(5));
    }
}