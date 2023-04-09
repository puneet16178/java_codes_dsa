package interview;

import java.util.*;

public class generic_ll_al {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al=new ArrayList<>();
		LinkedList <Integer> ll=new LinkedList<>();
		
		al.add(0);
		al.add(1);	
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.get(0));
		al.set(0,0);
		System.out.println(al.contains(1));
		
		System.out.println(al);
		
		
		
		ll.add(0);
		ll.add(1);	
		System.out.println(ll.size());
		ll.remove(0);
		System.out.println(ll.get(0));
		ll.set(0,0);
		System.out.println(ll.contains(1));
		
		System.out.println(ll);


	}

}
