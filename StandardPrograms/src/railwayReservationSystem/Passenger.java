package railwayReservationSystem;

public class Passenger extends Thread
{
	public RailwayReservation rr;
	public int passengerId;
	public String operation;
	public Passenger(RailwayReservation rr, int passengerId, String operation)
	{
		this.rr = rr;
		this.passengerId = passengerId;
		this.operation = operation;
	}
	public void run()
	{
		if(operation.equalsIgnoreCase("Book"))
		{
			try 
			{
				Thread.sleep(500);
				rr.bookedSeat(passengerId);
				
			} 
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
		}
		else if(operation.equalsIgnoreCase("Cancel"))
		{
			rr.cancelSeat(passengerId);
		}
	}
}
