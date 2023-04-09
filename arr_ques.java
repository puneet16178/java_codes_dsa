package dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arr_ques {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Enter array length: ");
		int length=Integer.parseInt(br.readLine());
		
		int[] arr = new int[length];
		System.out.println("Enter array elements: ");
		for(int i=0;i<length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter element you want to find: ");
		int x=Integer.parseInt(br.readLine());
		
		
		
		
		int str=0,end=(int) (Math.log(arr.length)+1),mid=(str+end)/2,count=0;
		
		for(int i=0;i<arr.length;i++) {
			count++;
			if(arr[mid]<x) {
				str=mid;
				mid=(str+end)/2;
			}
			else if(arr[mid]>x) {
				end=mid;
				mid=(str+end)/2;
			}
			else if(str>end) {
				System.out.println("no element was found");
			}
			else {
				System.out.println("Position was: "+mid);
				break;
			}
		}
		System.out.println(count);
		
		
		

	}

}
