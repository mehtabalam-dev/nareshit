package multithreadingPrograms;

import java.awt.Component.BaselineResizeBehavior;

/*
 * Online Ticket Booking System
 */
public class Qsn04 
{
	public static void main(String[] args) throws InterruptedException
	{
		TicketBooking obj = new TicketBooking();
		Customer t1 = new Customer("Customer A", 2, obj);
		Customer t2 = new Customer("Customer B", 2, obj);
		Customer t3 = new Customer("Customer C", 3, obj);
		t1.setName("Customer A");t2.setName("Customer B");t3.setName("Customer C");
		t1.start();t2.start();t3.start();
		t1.join();t2.join();t3.join();
		System.out.println("Tickets Reamining : "+obj.availableTickets);
	}
}
class TicketBooking
{
	public int availableTickets = 5;
	
	public synchronized void bookTicket(int numberOfTickets)
	{
		if(numberOfTickets <= availableTickets)
		{
			System.out.println(Thread.currentThread().getName()+" booked "+numberOfTickets+" tickets successfully.");
			availableTickets = availableTickets - numberOfTickets;
		}
		else
		{
			System.out.println("Booking failed for "+Thread.currentThread().getName()+" Not enough tickets available");
		}
	}
}
class Customer extends Thread
{
	public String name;
	public int numberOfTickets;
	public TicketBooking tb;
	public Customer(String name, int numberOfTickets, TicketBooking tb)
	{
		this.name = name;
		this.numberOfTickets = numberOfTickets;
		this.tb = tb;
	}
	public void run()
	{
		tb.bookTicket(numberOfTickets);
	}
}















