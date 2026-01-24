package Week12;
import java.util.ArrayList;


/**
 * Write a description of class BusCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusCompany
{
     private ArrayList<Bus> buses = new ArrayList<>();

     
     public void addBus(Bus bus) 
     {
        buses.add(bus);
     }

     
     public void removeBus(int index) 
     {
        if (index >= 0 && index < buses.size()) {
            buses.remove(index);
            System.out.println("Bus removed successfully.");
        } else {
            System.out.println("Error: Invalid index!");
        }
     }

     
     public void displayAllBuses() 
     {
        for (Bus bus : buses) {
            bus.displayDescription();
        }
     }

     
     public void displayBusesWithRateMoreThan500() 
     {
        for (Bus bus : buses) {
            if (bus.rate > 500) {
                bus.displayDescription();
            }
        }
     }

     
     public void displayRedOrBlueBuses() 
     {
        for (Bus bus : buses) {
            if (bus.color.equalsIgnoreCase("red") ||
                bus.color.equalsIgnoreCase("blue")) {
                bus.displayDescription();
            }
        }
     }
}