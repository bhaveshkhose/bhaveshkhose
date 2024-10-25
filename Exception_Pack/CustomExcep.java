package Exception_Pack;

public class CustomExcep extends Throwable{
	
	/**
	 * this is my first Custom Exception for the Java Exception
	 * My name is Bhavesh
	 */
	private static final long serialVersionUID = 9405445452L;

	CustomExcep(String msg){
		super(msg);
	}
	
	public String toString() {
		return "Exception in thread \"main\" CustomExcep Exception :" +getLocalizedMessage();
		
	}
	


}
