package day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
	   
	  int gradYear; 
	  boolean enrolled = false;

	  void enrolledStudent(){
	      enrolled = true;
	  }	    
	    //We added an additional instance variable 
	    //and method to our new class
	  
	  static Student addStudents(String name, int age, int gradYear, boolean enrolled){	  
		  Student new_student = new Student();
		  new_student.name = name;
		  new_student.age = age;
		  new_student.gradYear = gradYear;
		  new_student.enrolled = enrolled;
		  return new_student;
	  }
	  
	  public static void main(String[] args) {
//	      Student new_student = new Student();
//	      new_student.name = "Michael";
//	      new_student.age = 20;
//	      new_student.gradYear = 2020;
//	    
//	      new_student.enrolledStudent();
//	    
//	      System.out.println("Name: " + new_student.name + "\nAge: " 
//	          + new_student.age +"\nGraduation Year: " + new_student.gradYear 
//	          + "\nEnrolled? " + new_student.enrolled);
	    
//	      ArrayList<Student> studentList = new ArrayList<Student>();
//	      studentList.add(addStudents("Angela", 43, 1996, false));
//	      studentList.add(addStudents("Daniel", 33, 2002, true));
//	      studentList.add(addStudents("Ronald", 19, 2021, false));
//
//	      Student new_student = new Student();
//	      new_student.name = "Michael";
//	      new_student.age = 20;
//	      new_student.gradYear = 2020;
//	      studentList.add(new_student);
//	  
//	      Student new_student2 = new Student();
//	      new_student2.name = "Janice";
//	      new_student2.age = 32;
//	      new_student2.gradYear = 2019;
//	      studentList.add(new_student2);
//	  
//	      for (Student s : studentList){
//	    	  System.out.println("Name: " + s.name + "\nAge: " + 
//			  s.age +"\nGraduation Year: " + s.gradYear + 
//			  "\nEnrolled? " + s.enrolled);
//	      }
		  
		  Scanner in =  new Scanner(System.in);
	      ArrayList<Student> studentList = new ArrayList<Student>();
	      String studentName;
	      int studentAge;
	      int studentGradYear;
	      boolean enrollmentStatus;
	      String complete = "no";
	    //loop keeps getting user input as long as the complete variable equals "no"
	      while (complete.equals("no")) {
	    	  System.out.print("Enter a name: ");
	          studentName = in.nextLine();
	          System.out.print("Enter Age: ");
	          studentAge = Integer.parseInt(in.nextLine());
	          System.out.print("Year of Graduation: ");
	          studentGradYear = Integer.parseInt(in.nextLine());
	          System.out.print("Enrolled (enter true or false: )");
	          enrollmentStatus = Boolean.parseBoolean(in.nextLine());
	          studentList.add(addStudents(studentName, studentAge, studentGradYear, enrollmentStatus));
	          System.out.print("List complete? Enter yes or no: ");
	          complete = in.nextLine();
	      }
	 
  	      //loop through array list and output the contents one object at a time.
	      for (Student s : studentList){
	          System.out.println("Name: " + s.name + 
	          "\nAge: " +  s.age +"\nGraduation Year: " + s.gradYear +  "\nEnrolled? " + s.enrolled);
	      }
	 }
}



