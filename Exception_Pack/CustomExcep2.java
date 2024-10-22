package Exception_Pack;

public class CustomExcep2 extends Exception{
String msg ;
public CustomExcep2(String s) {
			
		msg = s;
		
	}

	public String toString() {
		
		return "CustomException"+msg;
	}

	public void addInformation(String string) {
		msg +=string;
		// TODO Auto-generated method stub
		
	}
	
	

}
