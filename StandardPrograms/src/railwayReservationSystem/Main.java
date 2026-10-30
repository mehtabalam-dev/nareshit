package railwayReservationSystem;

public class Main 
{
	public static void main(String[] args) throws InterruptedException
	{
		RailwayReservation obj = new RailwayReservation();

        // Step 1: Start five passengers to book seats
        Passenger[] p = new Passenger[5];

        for (int i = 0; i < p.length; i++)
        {
            p[i] = new Passenger(obj, 101 + i, "Book");
            p[i].start();
        }

        // Step 2: Wait until all five bookings finish
        for (int i = 0; i < p.length; i++)
        {
            p[i].join();
        }

        // Step 3: Try booking one extra seat
        Passenger extra = new Passenger(obj, 106, "Book");
        extra.start();
        extra.join();

        // Step 4: Cancel passenger 103's ticket
        Passenger cancel = new Passenger(obj, 103, "Cancel");
        cancel.start();
        cancel.join();

        // Step 5: Try cancelling a passenger who has no ticket
        Passenger invalidCancel = new Passenger(obj, 999, "Cancel");
        invalidCancel.start();
        invalidCancel.join();

        // Step 6: Display final seat status
        obj.displaySeats();
    }
}
	
//		RailwayReservation obj = new RailwayReservation();
//		for(int i = 101; i <= 106; i++)
//		{
//			new Passenger(obj,i,"Book").start();
//		}
//		Passenger p1 = new Passenger(obj,999,"Cancel");
//		p1.start();
//	}
//}
