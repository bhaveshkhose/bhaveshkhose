package DSA;

import java.util.*;

 class Nodejs {
	int data;
	Nodejs next;
	
	Nodejs(int data){
		this.data = data;
	}
	
}

public class LL 
{
	
	public static void display(Nodejs head) {
		if(head == null) {
			return;
		}
		
		System.out.print(head.data+" ,");
		display(head.next);
	}
	
	public static void displayr(Nodejs head) {
		if(head == null) {
			return;
		}
		displayr(head.next);
		System.out.print(head.data+" ,");
	}
	
	public static void main(String [] args) {
		
		Nodejs a = new Nodejs(10);
		Nodejs b = new Nodejs(8);
		Nodejs c = new Nodejs(6);
		Nodejs d = new Nodejs(4);
		Nodejs e = new Nodejs(2);
		Nodejs f = new Nodejs(-1);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f ;
		
		System.out.println(f.next);
		
//		System.out.println(a.next);
//		System.out.println(b);
//		System.out.println(b.next);//@2f92e0f4
//		System.out.println(c);
//		System.out.println(e.next);
//		System.out.println(a.next.data);
//		System.out.println(b.next.data);
//		System.out.println(a.data);
//
//		Nodejs temp = a;
//		int count =0;
//		while(temp != null) {
//			System.out.print(temp.data+" ,");
//			temp=temp.next;
//			count++;
//		}
//		System.out.println();
//
//		System.out.println("this is the length  :  "+count);
//		System.out.println();
//		display(a);
//		System.out.println();
//		displayr(a);
		
		
	}
}
