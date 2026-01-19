package Week11;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args)
    {
        //int orderId, double distance, String pickUp, dropOff
        Delivery d1= new CarDelivery(101, 10, "Budhanilkantha", "Lagankhel");
        System.out.println(d1.calculateCharge());//dynamic method dispatch
        
        Notification d3= new CarDelivery(101, 10, "Buddhanilkantha", "Lagankhel");
        d3.notify("Your orde has been placed");
        
        Delivery d2= new BikeDelivery(102, 12, "Naxal", "Patan");
        System.out.println(d2.calculateCharge());
    }
}