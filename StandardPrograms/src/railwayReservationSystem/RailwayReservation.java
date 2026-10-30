package railwayReservationSystem;

import java.util.Scanner;

public class RailwayReservation
{
	public int availableSeats = 5;
	public int[] bookedSeats = new int[5];
	public synchronized void bookedSeat(int passengerId)
	{
		if(availableSeats > 0)
		{
			for(int i = 0; i <= bookedSeats.length-1; i++)
			{
				if(bookedSeats[i]==0)
				{
					bookedSeats[i]=passengerId;
					System.out.println("Seat No = "+i+" is booked by : "+passengerId);
					break;
				}
			}
			availableSeats -= 1;
		}
		else
		{
			try
			{
				throw new NoSeatAvailableException();
			}
			catch(NoSeatAvailableException e)
			{
				System.out.println(e);
			}
		}
	}
	public synchronized void cancelSeat(int passengerId)
	{
	    boolean isTicketBooked = false;

	    for (int i = 0; i < bookedSeats.length; i++)
	    {
	        if (bookedSeats[i] == passengerId)
	        {
	            isTicketBooked = true;
	            bookedSeats[i] = 0;

	            System.out.println(
	                "Seat No = " + i
	                + " is cancelled by : " + passengerId
	            );

	            availableSeats++;
	            break;
	        }
	    }

	    if (isTicketBooked == false)
	    {
	        try
	        {
	            throw new BookingNotFoundException();
	        }
	        catch (BookingNotFoundException e)
	        {
	            System.out.println(e);
	        }
	    }
	}
	public synchronized void displaySeats()
	{
	    System.out.println("\n--- Railway Reservation Status ---");

	    for (int i = 0; i < bookedSeats.length; i++)
	    {
	        if (bookedSeats[i] == 0)
	        {
	            System.out.println("Seat No = " + i + " : Available");
	        }
	        else
	        {
	            System.out.println(
	                "Seat No = " + i + " : Booked by Passenger " + bookedSeats[i]
	            );
	        }
	    }

	    System.out.println("Available Seats = " + availableSeats);
	}
//	public synchronized void cancelSeat(int passengerId)
//	{
//		boolean isTicketBooked = false;
//		for(int i = 0; i <= bookedSeats.length-1; i++)
//		{
//			if(bookedSeats[i]==0)
//			{
//				isTicketBooked = true;
//				bookedSeats[i]=passengerId;
//				System.out.println("Seat No = "+i+" is cancel by : "+passengerId);
//				break;
//			}
//		}
//		if(isTicketBooked == true)
//		{
//			availableSeats += 1;
//		}
//		else
//		{
//			try
//			{
//				throw new BookingNotFoundException();
//			}
//			catch(BookingNotFoundException e)
//			{
//				System.out.println(e);
//			}
//		}
//	}
}
