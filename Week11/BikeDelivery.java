package Week11;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends Delivery
{
    private static final double PER_KM_CHARGE= 40;
    private static final double MIN_PER_KM= 2;
    public BikeDelivery(int orderId, double distance, String pickUp, String dropOff)
    {
        super(orderId, distance, pickUp, dropOff);
    }
    
    @Override
    public double calculateCharge()
    {
        return super.getDistance()* PER_KM_CHARGE;
    }
    
    @Override
    public double estimateTime()
    {
        return super.getDistance()* MIN_PER_KM;
    }
    
}