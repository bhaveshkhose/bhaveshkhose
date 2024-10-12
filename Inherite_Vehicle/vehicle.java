package Inherite_Vehicle;
import java.lang.String;

public  class vehicle {
	
	
	
	int maxSpeed;
	String modalName;
	int modalYear;
	int numberOfSeats;
	
	vehicle()
	{
		maxSpeed=200;
		System.out.println(maxSpeed);
		modalName="Urus";
		modalYear = 2024;
		numberOfSeats=4;
	}
	
	vehicle(int maxSpeed,String modalName,int modalYear,int numberOfSeats){
		this.maxSpeed = maxSpeed;
		System.out.println();
		this.modalName = modalName;
		this.modalYear= modalYear;
		this.numberOfSeats = numberOfSeats;
	}

	
	
	
	
}
