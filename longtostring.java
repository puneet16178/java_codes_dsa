package dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longtostring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-	generated method stub
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		String S = new String();
		S=br.readLine();
		int l= Integer.parseInt(S);
		
		System.out.println(Integer.toString(l,16));

	}

}
 