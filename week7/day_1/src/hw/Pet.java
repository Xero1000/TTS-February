package hw;

public class Pet {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	Pet(){
		
	}
	
	Pet(String name, int age, String location, String type){
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;		
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
}
