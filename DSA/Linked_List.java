package DSA;

class Node{
	int data;
	Node next ;
	Node prev;
	Node head = null ;
	public Node(int data) {
		this.data = data;
	}
}

public class Linked_List {
	
	Node head  ;
	
	Node current;
	
	//Method for add the elements in the linked list
	public void add(int data) {

		Node newNode = new Node(data);
		current = head;
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
	
	// Add a node to the first node
	 void addfirst(int data) {
		
		Node newNode = new Node( data);
		if(head == null) {
			head  = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;

		}
	}
	 
//	 Connect the last node to the Any given node
	 public void connect(int idx) {
		 Node temp = head;
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 
		 //Using for loop we are connect the last Node 
		 //to the index Node 
		 
		 Node current = head;
		 for(int i =0 ; i < idx ; i++)
		 {
			 current = current.next;
		 }
		 
		 //Connection is done
		  temp.next = current;
		 
	 }
	
	 //Method for getting data of the idx given by the user
	 public void getDataOf(int idx) {
		 Node temp = head;
		 for(int i =0 ; i <  idx ; i++) {
			 temp = temp.next;
		 }
		 System.out.println(temp.data);
	 }
	 
	// Method Add a node to the last node
	 public void addLast(int data) {
	        Node newNode = new Node(data);  // Create a new node with the given data

	        // If the list is empty, make the new node the head
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        // Traverse to the last node
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }

	        // Set the next of the last node to the new node
	        current.next = newNode;
	    }
	
	
	 
	 //Add the node at the place Entered by the user
	 public void addTheDataAt(int data , int num) throws Exception {
		 Node newNode = new Node(data);
		 Node current = head;
		 if(num>size()) {
			 throw new Exception("Can not insert at this position");
		 }
		 
		 if(num ==0) {
			 addfirst(data);
			 return;
		 }
		 
		 
		 
		 if(num == size()) {
			 addLast(data);
			 return;
		 }
		 for(int i =0 ; i < num -1;i++) {
			 current = current.next;
			 
		 }
		 
		 newNode.next =current.next;
		 current.next = newNode;
		 
		 
	 }
	
	//Print the Head of the Linked List
	public int printhead(){
		
		return head.data;
	}
	
	//Print the Linked list
	public void printList(Node head) {
		Node current = head;
		
				
		while(current != null) {
			System.out.print(current.data+"->");	
			current = current.next;
		}
		System.out.println("null");
    }
	
	
	//Print the size of the list
	public  int size() {
		int count=0;
		Node current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	//iteration of the list by the Index
	public int  getTheNode(int number) {
		int count =0 ;
		Node current = head;
		 while(current != null) {
			 if(count == number) {
				 return current.data;
			 }
			 
			 count++;
			 current = current.next;
		 }
		 
		 throw new IndexOutOfBoundsException("Index is Out of the Bound  "+number);
	}
	
	//Finding the Node in the linked List by the data Present in it
	public Node findNode(int data) {
		Node current = head;
		int count =0;
		while(head != null || current.next != null) {
			if(current.data == data) {
				System.out.println("We found the Node having "+data+" At the index of "+count);
				return current;
			}
		 current = current.next;
		 count++;
			
		}
		return null;
	}
	
	//Method to reverse the Linked List
	public void reverseList(Node head) {
		Node current = new Node(-1);
		current.next = head;
		Node prev = null;
		while(current != null) {
			Node nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		while(prev != null) {
			System.out.print(prev.data+" ->");
			prev = prev.next;
		}
		System.out.println();
	}
	
		
	//Merging the two sorting Lists
	 public static Node mergeTwoLists(Node list1, Node list2) {

	        // Creating a temperoy List to add the sorted element
	        Node temp =  new Node(-10);
	        Node current = temp;

	        //travesering the both list simultanously
	        while(list1 != null && list2 != null){
	            if(list1.data < list2.data ){
	                current.next = list1;
	                list1 = list1 . next;
	            }

	            else{
	                current.next = list2;
	                list2 = list2.next;
	            }

	            current = current.next;
	        }

	        if(list1 != null){
	            current .next  = list1;
	        }
	        else {
	            current .next = list2;
	        }


	    return temp.next;
	    
	    }
	 
	 //Method that return a boolean value if the data is present in the list
	 public boolean contains(int data)
	 {
		 Node current = head;
		 while(current != null) {
			 if(current.data == data) {
				 return true;
			 }
			 current = current.next;
		 }
		 return false; 
	 }
}
