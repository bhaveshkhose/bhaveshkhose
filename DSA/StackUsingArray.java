package DSA;
import java.util.*;

class Stack{
	int[] arr = new int[10];
	int n = arr.length;
	int size;
	int idx;
	
	public void push(int num) {
		if(size < n) {
			arr[idx] = num;
		}
		idx++;
		size++;
	}
	
	public int pop() {
		if(size <= 0) {
			return -1;
		}
		int i = arr[idx];
		//arr[idx] = 0;
		idx--;
		size--;
		return i;
	}
	public int peek() {
		int i = arr[idx];
		return i;
	}
	
	public int size() {
		return size;
	}
	
	public boolean contain(int ele) {
		for(int i =0 ; i < size ; i++) {
			if(arr[i] == ele) {
				return true;
			}
		}
		return false;
	}
	
	public void printStack() {
		for(int i = 0 ;  i < size; i ++ ) {
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		
		return false;
	}

}
public class StackUsingArray {
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(3);
		st.push(2);
		st.push(7);
		
		st.printStack();
		System.out.println(st.size());
		System.out.println(st.pop());
		st.printStack();
		System.out.println(st.isEmpty());
		System.out.println(st.contain(5));
		System.out.println(st.size());
		st.printStack();
}

}
