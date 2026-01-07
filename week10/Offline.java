package week10;


/**
 * Write a description of class Offline here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Offline extends course
{
    private double labFee;
    public Offline(int CourseId, String courseName, double baseFee, double labFee)
    {
        super(CourseId, courseName, baseFee);
        this.labFee= labFee;
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getBasefee() + this.labFee;
    }
    
    public void displayOfflineCourseDetails()
    {
        super.displayCourseDetails(); //courseId, course name
        System.out.println("total Fee for this offline course:" + this.calculateFee());
    }
}
