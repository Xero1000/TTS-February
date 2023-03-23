package car;

public class Car {
	
	private String name; 
	private String color;

	public Car() {
		
	}
	
	public Car (String name, String color) {
		this.name = name; 
		this.color = color; 
	}
    
    public String getName(){
		return this.name;
	}
    
    public String getColor(){
    	return this.color;
    }

    @Override
    public String toString() 
    {
        return String.format("This %s car is %s.", 
                this.getName(),
                this.getColor());
    }


   public static void main(String[] args){
        Car myCar = new Car("crossover", "blue");

        System.out.println(myCar); // output: This crossover car is blue.
   }

}
