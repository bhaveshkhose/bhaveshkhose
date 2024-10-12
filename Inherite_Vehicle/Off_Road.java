package Inherite_Vehicle;

public class Off_Road extends Road_Vehicle {
	
	Off_Road(){
		super();
		
		
		System.out.println("THAR");
	}
	
	public static void main(String [] args) {
		
		Off_Road car1 = new Off_Road();
	}
}
