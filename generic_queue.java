package interview;

import java.util.*;

public class generic_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		System.out.println(q.element());
		q.add(8);
		System.out.println(q.element());
		
		System.out.println(q.offer(1));
		q.add(9);
		System.out.println(q.offer(7));
		
		System.out.println(q.poll());
		q.add(10);
		System.out.println(q.poll());
		
		System.out.println(q.peek());
		q.add(11);
		System.out.println(q.peek());

	}

}
