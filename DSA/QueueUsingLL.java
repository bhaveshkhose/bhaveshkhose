package DSA;

public class QueueUsingLL extends Linked_List{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data= data;
		}
	}
	
	Node fornt = null;
	Node end  = null;
	int size =0;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(fornt == null && end == null) { 
			fornt = end= newNode;
			size++;
			
		}
		else {
			end.next = newNode;
			end = newNode;
			size++;
		}
	}
	
	 public void printQueue(Node fornt ){
		 Node current = fornt;
		 while(current != end.next) {
			 System.out.print(current.data +" ");
			 current = current.next;
		 }
		 System.out.println();
		
	}
	 
	 public int peek() {
		 return fornt.data;
	 }
	 
	 public int poll() {
		 try{int a = fornt.data;
		 fornt = fornt.next;
		 size--;
		 return a;
		 }
		 catch(NullPointerException e) {
			 System.out.println("Can't remove , queue is empty");
			 return  -1;
		 }
	 }
	 public int size() {
		 return size;
	 }
	 public boolean isEmpty() {
		 return size== 0 ? true : false ;
	 }
	 
	 

}
