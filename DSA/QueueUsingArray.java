package DSA;

public class QueueUsingArray {
	
		int[] Q = new int[100];
		int f = -1;
		int r = -1;
		int size = 0;
		
		public void add(int data) {
			
			if (r == Q.length -1) {
				System.out.println("Queue limit reach ");
				return;
			}
			
			if( f == -1 && r == -1){
				Q[f+1] = data;
				f++;
				r++;
				size++;
				
			}
			else {
				Q[r+1] = data;
				r++;
				size++;		
			}
		}
		public void printQueue() {
		
			for(int i = f ; i <= r ; i++) {
				System.out.print(Q[i]+" ,");
			}
			System.out.println();
		}	
		public int poll() {
			f++;
			return Q[f-1];
		}
		
		public int peek() {
			return Q[f];
		}

}
			


