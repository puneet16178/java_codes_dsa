

import java.util.*;
import java.util.Scanner; 

public class tcsq2 {
     
    public static void main(String argc[])
    {
	Scanner myObj = new Scanner(System.in);
	String str = myObj.nextLine();
        
	String myArr[] = str.split("");
    	
    int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;

	for(int i=0;i<myArr.length;i++){
    	if(myArr[i].equals("N")){
	        count1++;
	    }
	    if(myArr[i].equals("E")){
	        count2++;
	    }  
	    if(myArr[i].equals("W")){
	        count3++;
	    }
	    if(myArr[i].equals("S")){
	    count4++;
	    }
	}
	
		
	if(count1==count4 && count2==count3){
		System.out.print("Sucessfull");
	}
	else{
		System.out.print("Not Sucessfull");
	}

    }
}