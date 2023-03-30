package lambdas;

import java.util.ArrayList; 

//public class LambdaShowcase 
//{ 
//    public static void main(String args[]) 
//    { 
// 
//        ArrayList<String> students = new ArrayList<String>(); 
//        
//        students.add("Bob"); 
//        students.add("Jane"); 
//        students.add("Steve"); 
//        students.add("Jessica"); 
//  
//        students.forEach(student -> System.out.println(student)); 
//    } 
//} 

public class LambdaShowcase 
{ 
    public static void main(String args[]) 
    { 
 
        ArrayList<String> students = new ArrayList<String>(); 
        
        students.add("Bob"); 
        students.add("Jane"); 
        students.add("Steve"); 
        students.add("Jessica"); 
  		
        //notice the lack of brackets after the conditional
        students.forEach(student -> {
        	if (student.substring(0,1).equals("J"))
        		System.out.println(student);
            }); 
    } 
}