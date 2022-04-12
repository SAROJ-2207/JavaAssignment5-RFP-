import java.util.*;

class SwapNumber {
		
		public static void main (String args[]){
			
			Scanner user_input = new Scanner(System.in);
			System.out.print("Enter Number 1: - ");
			int num1=user_input.nextInt();
			System.out.print("Enter Number 2: - ");
			int num2=user_input.nextInt();
			int temp;
			 
			temp=num1;
			num1=num2;
			num2=temp;
			
			System.out.print(" After Swapping "+"\n =============");
			System.out.print("\n Number 1: - "+num1+"\n Number 2: - "+num2);			
			}
		}