package collectionsPrograms;

import java.util.Scanner;
import java.util.Vector;

public class StackClassroomQsn02 
{
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of passenger: ");
        Vector<Passenger> passengers = new Vector<>();
        int numberOfPassenger = sc.nextInt();
        double totalFare = 0;
        for(int i = 0; i < numberOfPassenger; i++)
        {
        		System.out.println("Enter passenger id: ");
            int passengerId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter passenger name: ");
            String passengerName = sc.nextLine();
            System.out.println("Enter passenger ticket fare: ");
            double ticketFare = sc.nextDouble();
            if(ticketFare <= 0)
            {
                System.out.println("Ticket fare must be greater than 0");
                System.exit(0);
            }
            Passenger obj = new Passenger(passengerId,passengerName,ticketFare);
            passengers.add(obj);
            totalFare = totalFare + ticketFare;


        }
        for(Passenger e : passengers)
        {
            System.out.println(e);
        }
        System.out.println("Total Fare Collected: "+totalFare);
        
    }
}
class Passenger
{
    private int passengerId;
    private String passengerName;
    private double ticketFare;

    public Passenger(int passengerId,String passengerName,double ticketFare)
    {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.ticketFare = ticketFare;
    }
    @Override
    public String toString()
    {
        return (passengerId + " "+passengerName +" "+ticketFare);
    }
}
