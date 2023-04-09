

import java.util.Scanner;

public class avg_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int n = myObj.nextInt();
		
		int[] arr = new int[n];
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=myObj.nextInt();
			sum1=sum1+arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			sum2=sum2+arr[i];
			sum1=sum1-arr[i];
			if((sum1/(arr.length-i-1))==(sum2/(i+1))) {
				int x=i+1;
				System.out.println("Avg is: "+sum1+" at "+x+"th position");
			}
		}
		
		

	}

}
