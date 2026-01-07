package week_8;


/**
 * Write a description of class EmployeeTes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTes
{
    public static void main(String [] args)
    {
        EmployeeSalary esl= new EmployeeSalary(1000000);
        esl.displayEmployeeSalary();
        esl.setbasicSalary(1200000);
        esl.displayEmployeeSalary();
    }
}