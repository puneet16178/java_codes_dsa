package dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string_ques {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		String S = new String();
		S=br.readLine();
		
		System.out.println(S.substring(S.length()-2)+S.substring(0,S.length()-2));
		
		//str = str.toLowerCase();
		//str.charAt(i);
		//String[] s2 = str.split(" ");
		//s1.equalsIgnoreCase(s2);
		//Integer.parseInt(s2);
		//System.out.println(firstAlphabet(S));
		//System.out.println(remove(S));

	}
	
//	static String remove(String s) {
//        // code here
//		String str="";
//        if(s.length()==0 || s.length()==1){
//            return str;
//        }
//        
//        if(s.charAt(0)!=s.charAt(1)){
//            str=str+s.charAt(0);
//        }
//        
//        for(int i=1;i<s.length()-1;i++){
//            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i-1)){
//                str=str+s.charAt(i);
//            }
//            
//        }
//        if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
//            str=str+s.charAt(s.length()-1);
//        }
//        System.out.println(str);
//        if(str.length()>1){
//            for(int i=0;i<s.length()-1;i++){
//                if(s.charAt(i)==s.charAt(i+1)){
//                    str=remove(str);
//                }
//            }
//        }        
//        return str;
//        
//    }
//	
//	static String firstAlphabet(String S) {
//        // code here
//        String str="";
//        if(S.equals("")){
//            return str;
//        }
//        str=""+S.charAt(0);
//        for(int i=0;i<S.length();i++){
//            if(S.charAt(i)==' '){
//                str=str+S.charAt(i+1);
//            }
//        }
//        return str;
//    }

}
