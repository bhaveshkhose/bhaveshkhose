package Exception_Pack;
import java.util.Scanner; 

public class CustomExcep3 extends Exception {
	
	CustomExcep3(String msg){
		super(msg);
	}
	
	public String toString() {
		return "Class is full Exception"+getMessage();
	}

	public void addSuppressed(String string) {
		// TODO Auto-generated method stub
		
	}

}

