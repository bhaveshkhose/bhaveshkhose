package DSA;

import java.util.Stack;
public class queue {
 
		public static void main(String [] args) {
			
			QueueUsingArray Q = new QueueUsingArray();
			Q.add(1);
			Q.add(2);
			Q.add(3);
			Q.add(4);
			Q.add(5);
			Q.printQueue();
			System.out.println(Q.poll());
			Q.printQueue();
			Q.poll();
			Q.printQueue();
			Q.add(48);
			Q.printQueue();
			System.out.println(Q.peek());
			System.out.println();
			
			QueueUsingLL q  = new QueueUsingLL();
			q.add(3);
			q.add(4);
			q.add(5);
			q.add(6);
			q.add(10);
			q.printQueue(q.fornt);
			System.out.println(q.peek());
			q.poll();
			q.printQueue(q.fornt);
			System.out.println(q.size());
			q.printQueue(q.fornt);
			System.out.println(q.fornt);
			q.poll();
			System.out.println(q.size());
			q.add(48);
			q.add(46);
			System.out.println(q.size());
			System.out.println(q.isEmpty());
			q.printQueue(q.fornt);
			
			
		}
}

class QueueUsingStack{
	Stack<Integer> st = new Stack<>();
	
	public void add(int data) {
		st.push(data);
	}
	
	
}
