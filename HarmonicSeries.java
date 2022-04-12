import java.util.*;

class HarmonicSeries {
		public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		double sum=0.0;
		int num,i;
		System.out.print("Enter Any number :- ");
		num = sc.nextInt();
		
		for(i=1;i<=num;i++){
			sum = sum + (double)1/i;
			
			System.out.print(sum+" , ");
		}
	}
}	
		