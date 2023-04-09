package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class relevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int count=1,mincount=Integer.MAX_VALUE,val=0;	
		int T =sc.nextInt();
		for(int k =0;k<T;k++) {
			int N=sc.nextInt();
			int D=sc.nextInt();
			int []arr=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						System.out.println(count);
						System.out.println(i+""+j);
						if(count==D) {
							val=j-i+1;
							if(mincount<val) {
								
								mincount=val;
							}
						}
						
					}
				}count=1;
			}
			System.out.print(mincount);
			
			
		}
			

	}

}
