package dsa;

import java.util.*;


public class testques {

//	static void printPowerSet(String s,int i, String cur){
//		
//		if(i==s.length()) {
//			System.out.println(cur);
//			//return;
//		}
//	
//		printPowerSet(s,i+1,cur+s.charAt(i));
//		printPowerSet(s,i+1,cur);
//			
//	}
	
//	public static void smallestnear(int a[], Stack<Integer> st) {
//		for(int i=0;i<a.length;i++) {
//			if(st.isEmpty()) {
//				System.out.println(-1);
//				st.push(a[i]);
//			}
//			else {
//				if(st.peek()<=a[i]) {
//					System.out.println(st.peek());
//					st.push(a[i]);
//				}
//				else {
//					while(!st.isEmpty() && st.peek()>a[i]) {
//						st.pop();
//					}
//					if(st.isEmpty()) {
//						System.out.println(-1);
//					}
//					else {
//						System.out.println(st.peek());
//					}
//					st.push(a[i]);
//				}
//			}
//		}
//	}
	
//	public static void smallestnext(int a[],Stack<Integer> st) {
//		for(int i=a.length-1;i>=0;i--) {
//			if(st.isEmpty()) {
//				st.push(-1);
//			}
//			if(st.peek()<a[i]) {
//				System.out.println(st.peek());
//				st.push(a[i]);
//			}
//			else {
//				while(a[i]<st.peek()) {
//					st.pop();
//				}
//				System.out.println(st.peek());
//				st.push(a[i]);
//			}
//		}
//		
//	}

	
//	public static void parbalance(String s,Stack<Character> st) {
//		boolean x=true;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='{') {
//				st.push('{');
//			}
//			if(s.charAt(i)=='(') {
//				st.push('(');
//			}
//			if(s.charAt(i)=='[') {
//				st.push('[');
//			}
//			if(s.charAt(i)=='}') {
//				if(st.isEmpty()) {
//					x=false;
//					break;
//				}
//				if(st.peek()=='{') {
//					st.pop();
//				}
//			}
//			if(s.charAt(i)==')') {
//				if(st.isEmpty()) {
//					x=false;
//					break;
//				}
//				if(st.peek()=='(') {
//					st.pop();
//				}
//			}
//			if(s.charAt(i)==']') {
//				if(st.isEmpty()) {
//					x=false;
//					break;
//				}
//				if(st.peek()=='[') {
//					st.pop();
//				}
//			}
//		}
//		if(!st.isEmpty()) {
//			x=false;
//		}
//		System.out.print(x);
//		
//		
//	}
	
	
//	public static void infixtopostfix(String s,Stack<Character> st) {
//		//st.push('(');
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='(') {
//				st.push(s.charAt(i));
//			}
//			else if(s.charAt(i)==')') {
//				while((char)st.peek()!='(') {
//					System.out.print(st.peek());
//					st.pop();
//				}st.pop();
//			}
//			else if(s.charAt(i)=='^'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-') {
//				if(st.isEmpty()) {
//					st.push(s.charAt(i));
//				}
//				else {
//					if(getPriority(s.charAt(i))>getPriority((char)st.peek())) {
//						st.push(s.charAt(i));
//					}
//					else {
//						while(!st.isEmpty()&&getPriority(s.charAt(i))<getPriority((char)st.peek())) {
//							System.out.print(st.peek());
//							st.pop();
//							//System.out.println("no. of times");
//						}
//						st.push(s.charAt(i));
//					}	
//				}
//			}
//			else {
//				System.out.print(s.charAt(i));
//			}
//		}System.out.print(st.pop());
//	}
//	
//	private static int getPriority(char charAt) {
//	// TODO Auto-generated method stub
//	int x=0;
//	
//	if(charAt=='^') {
//		x=5;
//	}
//	if(charAt=='/') {
//		x=4;
//	}
//	if(charAt=='*') {
//		x=3;
//	}
//	if(charAt=='+') {
//		x=2;
//	}
//	if(charAt=='-') {
//		x=1;
//	}
//		
//	return x;
//}

//	//@SuppressWarnings("unchecked")
//	public static void hashingque(HashMap map, String s1, String s2) {
//		if(s1.length()==s2.length()) {
//			for(int i=0;i<s1.length();i++) {
//				
//				if(!map.containsKey(s1.charAt(i))) {
//					map.put(s1.charAt(i),1);
//				}
//				else {
//					map.put(s1.charAt(i),(int)map.get(s1.charAt(i))+1);
//				}
//			}
//			System.out.println(map);
//			for(int i=0;i<s1.length();i++) {
//				
//				if(!map.containsKey(s1.charAt(i))) {
//					break;
//				}
//				else {
//					map.put(s1.charAt(i),(int)map.get(s1.charAt(i))-1);
//					if((int)map.get(s1.charAt(i))==0) {
//						map.remove(s1.charAt(i));
//					}
//				}
//			}
//			System.out.println(map.size());
//				
//			if(map.size()==0) {
//				System.out.println("anagram");
//			}
//			else {
//				System.out.println("not anagram");
//			}
//		}
//		else {
//			System.out.println("not anagram");
//		}
		
		
//		int start=0,end=-1,cursum=0;
//		for(int i=0;i<a.length;i++) {
//			cursum=cursum+a[i];
//			map.put(cursum, i);
//			if(cursum-k==0) {
//				end=0;
//			}
//			if(map.containsKey(cursum-k)) {
//				start=(int) map.get(cursum-k);
//				end=i;
//			}
//		}
//		System.out.println("Start: "+start+" and End: "+end);
//	}
	
	
//	public static void hashingque(HashMap map, int a[], int k) {
//		int maj=-1;
//		for(int i=0;i<a.length;i++) {
//			if(!map.containsKey(a[i])) {
//				map.put(a[i], 1);
//			}
//			else {
//				map.replace(a[i], (int)map.get(a[i])+1);
//				if((int)map.get(a[i])>a.length/2){
//					maj=(int)map.get(a[i]);
//					//value associated with that key
//				}
//			}
//		}
//		map.forEach((key,value) -> {
//			if((int)value>a.length/2) {
//				System.out.println("key: "+key);
//			}
//		}); 
//		
//		System.out.println("maj: "+maj);
//
//	}
	
	
	
	
		
	public static void main(String[] args) {
		
		
		
		
		
//		HashMap <Character,Integer> map = new HashMap<>();
				
//		String s1="abcabcc";
//		String s2="aabbcc";
		
//		int [] a= {1,1,-5,1,1,5};
//		
//		int k =5;
//		
//		hashingque(map,a,k);
	
//		Stack <Character> st = new Stack<>();
		
//		String s ="a+b*(c^d-e)^(f+g*h)-i";
		
//		infixtopostfix(s,st);
		
		
//		parbalance(s,st);
		
//		int [] a= {3,10,5,1,15,10,7,6};
//		
		
//		smallestnext(a,st);
		
		//smallestnear(a,st);
		
	
	}

}
