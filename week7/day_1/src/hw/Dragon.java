package hw;

public class Dragon {
	
	private String name;
	private String scaleColor;
	private int age; 
	
	Dragon(){
		
	}
	
	Dragon(String name, String scaleColor){
		this.name = name;
		this.scaleColor = scaleColor; 
	}
	
	Dragon(String name, String scaleColor, int age){
		this.name = name;
		this.scaleColor = scaleColor;
		this.age = age; 
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getScaleColor() {
		return this.scaleColor;
	}
	
	public void setScaleColor(String scaleColor) {
		this.scaleColor = scaleColor;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean canFly() {
		return true;
	}
	
	public String messageFromDragon() {
		return "I will not part with a SSSSINGLE coin! Not! One! PIECE OF IT!";
	}
}
