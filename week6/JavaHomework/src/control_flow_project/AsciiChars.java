package control_flow_project;

public class AsciiChars 
{
	
	public static void printNumbers()
	{
		System.out.print("0 - 9: ");
		for (int i = 48; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void printLowerCase()
	{
	  System.out.print("a - z: ");
	  for (int i = 97; i <= 122; i++) {
		  System.out.print(i + " ");
	  }
	  System.out.println();
	}
	
	public static void printUpperCase()
	{
		System.out.print("A - Z: ");
	    for (int i = 65; i <= 90; i++) {
		    System.out.print(i + " ");
	    }
	    System.out.println();
	}
}
