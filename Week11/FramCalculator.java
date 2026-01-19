package Week11;
import javax.swing.GroupLayout;


/**
 * Write a description of class FramCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FramCalculator
{
     public static void main(String[] args) 
    {Crop[] farm = new Crop[3];
        farm[0] = new Rice(1.5);
        farm[1] = new Wheat(1.0);
        farm[2] = new Maize(0.8);

        for (Crop c : farm) 
        {
            c.displayCropInfo();

            Transportable t = (Transportable) c;
            System.out.println("Transport Method: " + t.getTransportMethod());
            System.out.println("Transport Cost: Rs. " + t.calculateTransportCost());

            System.out.println("----------------------------");
        }
    }
}