package day_2;
import java.lang.Math;

public class Person {
	
	String name;
	int age;
	String location;
	
	public Person() {

	}
	
	public Person(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Person firstPerson = new Person();

		Person secondPerson = new Person("John");

		Person thirdPerson = new Person("Jane", 45, "London");
		
		thirdPerson.sayHello();
		thirdPerson.reallyHardMath();
	}
	
//	public boolean getIsAlive() {
//		return this.isAlive;
//	}
	
	public void sayHello(){
	   System.out.println("Hello " +  name);
	}
	
	public int birthday() {
		return age + 1;
	}

	public void reallyHardMath(){
	    double answer = (-5 + Math.sqrt(5*2 - 4 * (8*15)))/(2 * 8);
	    System.out.println(answer);
	}
}
