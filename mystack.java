package interview;

public class mystack {
	
	public class mystk{
		int top;
		int capacity=10;
		String arr[]=new String[capacity];
		
		public mystk() {
			this.capacity=capacity;
			top=-1;
		}
		
		public void push(String str) {
			if(top==capacity-1) {
				System.out.println("Stack full");
			}
			top++;
			arr[top]=str;			
		}
		
		public void pop() {
			if(top==-1) {
				System.out.println("Stack empty");
			}
			else {
				String str=arr[top];
				top--;
			}
			
		}
		
		public void peek() {
			if(top==-1) {
				System.out.println("Stack empty");
			}
			else {
				System.out.println(arr[top]);
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdef";
		String [] str2=str.split("");
		
		mystk st = new mystk();
		st.push(str2[0]);

	}

}
