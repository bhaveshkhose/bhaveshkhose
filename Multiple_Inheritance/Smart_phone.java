package Multiple_Inheritance;

import java.util.Stack;

public class Smart_phone implements camera,Telephone,torch{

	@Override
	public void on_off_the_torch(int a) {
		
		if( a==0)System.out.println("torch is Off");
		else if(a==1)System.out.println("torch is On");
		else
			System.out.println("Enter the valid number");
			
		
	}

	
	
	@Override
	public void click_photos() {
		
		System.out.println("khicchhik");
		
		// TODO Auto-generated method stub
		
	}



	@Override
	public void make_a_call(String a) {
		
		System.out.println("ringing......");
		
		
			
		}
		// TODO Auto-generated method stub
	public static void main(String [] args) {
		Stack< Character > st = new Stack<>();
		String s = "bhavesh";
		char[] c = s.toCharArray();
		System.out.println(c[0]);
		st.push('a');
		System.out.println(st.peek());
	}
		
	}


