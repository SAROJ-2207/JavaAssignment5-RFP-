import java.util.*;

class DistanceBwPoint
{
	public static void main(String arg[])	
	{
			Scanner obj = new Scanner(System.in);
			System.out.print("Enter the X Value :- ");
            int x = obj.nextInt();
			System.out.print("Enter the Y Value :- ");
			int y = obj.nextInt();
			
			double dis=Math.sqrt(x*x + y*y);	 	    
		    System.out.println("Distance :- "+dis);
	}
}