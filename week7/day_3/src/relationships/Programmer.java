package relationships;

public class Programmer {
	
	public String name;
	
	//Creating HAS-A relationship with Address class
	public Address programmerAddr; 
	
	public Programmer(String name, Address addr){
		this.name=name;
		this.programmerAddr = addr;
	}
}
