package Interfaces;



public class Airways implements MakeMyTrip 
{

	@Override
	public void date(int a)
	{
		System.out.println("Select you are date"+a);
		
	}

	@Override
	public void source(String b) 
	{
		System.out.println("Place Select the Source Place :"+b);
		
	}
	public static void main(String args[])
	{
		MakeMyTrip trip = new Airways();
		   trip.date(12-04-24);
		  trip.bookingStatus("Sucess");
		  trip.source("Hyderbad");
		 MakeMyTrip.Destination("USA");
	
		
}

    
}
