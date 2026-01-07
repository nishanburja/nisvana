package week9;

public class car extends vehicle
{
    private int doors;
    private String fuelType;
    
    public car(int vehicleId, String brand, double baseprice, int doors, String fuelType)
    {
        //parent constructors
        super(vehicleId, brand, baseprice);
        this.doors= doors;
        this.fuelType= fuelType;
    }
    
    public double calculatorfinalprice()
    {
        return super.baseprice + super.calculatetax()+ 0.05 * super.baseprice;
    }
    
    public void displaycardetails()
    {
        super.displayvehicleInfo();
        System.out.println("No of doors: " + this.doors);
        System.out.println("Fuel type: " + this.fuelType);
    }
}