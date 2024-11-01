package DSA;

class Node{
	int data;
	Node next ;
	public Node(int data) {

		this.data = data;
	}
}
public class Linked_List {
	
		Node head = null
	
	public void add(int data) {

		Node newNode = new Node(data);
		Node current = head;
		if(head==null) 
			head= newNode;
		else
		{
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void addfirst(int data) {
		
	}
	
	public void printlist() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");	
			current= current.next;
			
		}
		System.out.println();
}
}
