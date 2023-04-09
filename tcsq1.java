

import java.util.*;
import java.util.Scanner; 

public class tcsq1 {

	static int digSum(int n)
    {
        int sum = 0;
 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		  int n = myObj.nextInt();
		  
		  if(digSum(n)==1)
		  {System.out.println("UNO");}
		  else
		  {System.out.println("NOT UNO");}
		        		
	}

}