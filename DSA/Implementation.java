package DSA;


public class Implementation {
	
	public static void main(String[] args) throws Exception
	{
		Linked_List list = new Linked_List();
		list.add(3);
		list.add(5);
		list.add(28);
		list.add(4);
		list.add(10);
		list.add(7);
		list.add(77);
		
		int n =0;
		Node current = list.head;
		while(current != null) {
			n++;
			current = current.next;
		}
		
		System.out.println(n);
		System.out.println()	;	
	    System.out.println(list.contains( 3));
		
	
		
	}
}