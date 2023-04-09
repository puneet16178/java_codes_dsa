package dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution {
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
		
		System.out.println(MissingNumber(arr, length));
		
	}
	
	public static int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int start=0,end=n-1,mid=(start+end)/2;
        
        return findnum(array, start, end, mid);
    }
	public static int x=0;
	public static int findnum(int array[], int start, int end,int mid){
        //int x=0;
        if(array[mid]-mid==1)   {
            if(mid==start){
                x=array[end]-1;
            }
            else{
                //x=x+1;
                start=mid;
                mid=(start+end)/2;
                findnum(array, start, end, mid);
            }
            
        }
        else {
            if(mid==0){
                x=array[0]-1;
            }
            else if(mid-1==array[mid-1]){
                x=mid+1;
            }
            else{
                end=mid;
                mid=(start+end)/2;
                findnum(array, start, end, mid);
            }
        }
        return x;
    }
    
    
        
    
}