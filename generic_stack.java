package interview;

import java.util.Stack;

public class generic_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> st=new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.empty());
		System.out.println(st.search(4));
		

	}

}
