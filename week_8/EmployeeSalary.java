package week_8;


/**
 * Write a description of class EmployeeSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalary
{
    private double basicSalary;
    public EmployeeSalary(double basicSalary)
     {
         this.basicSalary= basicSalary;
     }
     
     //getters and setters methods
    public void setbasicSalary(double basicSal)
    {
        this.basicSalary=basicSalary;
    }
    
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
    
    public double valculatorGrossSalary()
    {
        double bonus= 0.20*this.basicSalary;
        return this.basicSalary+bonus;
    }
    
    public void displayEmployeeSalary()
    {
        System.out.println("Basic Salary: "+ getBasicSalary());
        double grossSalary= valculatorGrossSalary();
        System.out.println("Gross Salary: " + grossSalary);
    }
}