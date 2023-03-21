package oop;

//class definition
public class Car
{
	private String color;
	private int numberOfDoors;

    // no-arg constructor
    public Car() 
    {
        setColor("White");
        setNumberOfDoors(2);
    }	
 
    // constructor with arguments
    public Car(String color, int doors)
    {
        setColor(color);
        setNumberOfDoors(doors);	
    }
    
	public void start()
    {
       System.out.println("Car starting");
    }

	public void stop()
    {
       System.out.println("Car stopping");
    }

	// Just start driving
	public void drive()
	{
	    System.out.println("Car driving");
	}
	 
	// Drive for the specified number of miles
	public void drive(int miles)
	{
	    System.out.println("Driving for " + miles + " miles.");
	}
	 
	// Drive specified miles at the specified speed
	public void drive(int miles, int speed)
	{
	    System.out.println("Driving " + speed + "mph for " + miles + " miles.");
	}
	 
	// drive to the specified destination
	public void drive(String destination)
	{
	    System.out.println("Driving to " + destination);
	}
	
    public String getColor() 
    {
        return color;	
    }
	
    public void setColor(String color) 
    {	
        this.color = color;	
    }
	 	
    public int getNumberOfDoors() 	
    {	
        return numberOfDoors;	
    }
		
    public void setNumberOfDoors(int numberOfDoors) 	
    {
        if ( numberOfDoors >= 1 && numberOfDoors <= 6)	
            this.numberOfDoors = numberOfDoors;	
        else	
            this.numberOfDoors = -1;	
    }
}


//public class Car 
//{
//    // private (internal) constants
//    private static final int MAX_DOORS = 6;
//    private static final int MIN_DOORS = 1;
// 
//    // public (external) constants
//    public static final String TYPE_SPORTY = "Sporty";
//    public static final String TYPE_FAMILY = "Family";
// 
//    // a new property and its respective accessors
//    private String carType;
//    private int numberOfDoors;
// 
//    public String getCarType() 
//    {
//        return carType;
//    }
//    public void setCarType(String carType) 
//    {
//        this.carType = carType;
//    }
//    // rest of class the same with the exception of setNumberOfDoors
//    public void setNumberOfDoors(int numberOfDoors) 
//    {
//        if ( MIN_DOORS >= 1 && numberOfDoors <= MAX_DOORS)
//            this.numberOfDoors = numberOfDoors;
//        else
//            this.numberOfDoors = -1;
//    }
//}
 
// Car fam = new Car("White", 4);
// fam.setCarType(Car.TYPE_FAMILY);
