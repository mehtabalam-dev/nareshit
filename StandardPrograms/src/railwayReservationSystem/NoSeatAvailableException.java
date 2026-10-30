package railwayReservationSystem;

public class NoSeatAvailableException extends Exception
{
	public NoSeatAvailableException()
	{
		super("No seat available");
	}
}
