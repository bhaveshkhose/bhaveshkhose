package DSA;

import java.util.Stack;

public class LL 
{
	
	public static void main(String [] args) {
		
		Stack<Integer> st = new Stack<>();
		st.push(5);
		st.push(8);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.push(7);
		System.out.println(st);
		
		
	}
}
