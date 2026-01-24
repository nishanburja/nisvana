package Week12;


/**
 * Write a description of class Task3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private String group;
    private long phoneNumber;
    
    public Student(String name, String group, long phone)
    {
        this.name= name;
        this.group= group;
        this.phoneNumber= phone;
    }
    
    public void setName(String name)
    {
        this.name= name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setGroup(String group)
    {
        this.group=group;
    }
    
    public String getGroup()
    {
        return this.group;
    }
    
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(long phone)
    {
        this.phoneNumber=phone;
    }
    
    @Override
    public String toString()
    {
        return "name: "+ this.name + " group: "+ this.group + " phone number: " + this.phoneNumber;
    }
}