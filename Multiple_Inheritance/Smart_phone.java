package Multiple_Inheritance;

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
		
	}

