package collectionsPrograms;

import java.util.Vector;

public class VectorPracticeQsn05
{
	public static void main(String[] args) 
	{
		ParkingLot pl = new ParkingLot();
		pl.parkVehicle(2,"UP57N8094");
		pl.parkVehicle(2, "UP53MN9090");
		pl.removeVehicle(2);
		pl.displayAllSlots();
	}
}
class ParkingSlot
{
	public int slotNumber;
	public String vehicleNumber = "";
	public boolean occupied;
	
	public ParkingSlot(int slotNumber)
	{
		this.slotNumber = slotNumber;
	}
	public boolean parkVehicle(String vehicleNumber)
	{
		if(occupied == false)
		{
			this.vehicleNumber = vehicleNumber;
			occupied = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	public void removeVehicle()
	{
		if(occupied == true)
		{
			vehicleNumber = "";
			occupied = false;
		}
	}
	public void displaySlot()
	{
		System.out.println("Slot number     :  "+slotNumber);
		System.out.println("Occupied status :  "+occupied);
		if(occupied == true)
		{
			System.out.println("Vehicle Number  :  "+vehicleNumber);
		}
	}
}
class ParkingLot
{
	public Vector<ParkingSlot> slots = new Vector<ParkingSlot>();
	public ParkingLot()
	{
		for(int i = 1; i <= 5; i++)
		{
			slots.add(new ParkingSlot(i));
		}
	}
	public void parkVehicle(int slotNumber,String vehicleNumber)
	{
		boolean isSlotFound = false;
		for(ParkingSlot slot : slots)
		{
			if(slot.slotNumber == slotNumber)
			{
				isSlotFound = true;
				if(slot.parkVehicle(vehicleNumber))
				{
					System.out.println("Vehicle parked successfully.");
				}
				else
				{
					System.out.println("Slot is already occupied.");
				}
			}
		}
		if(isSlotFound == false)
		{
			System.out.println("Invalid slot number");
		}
	}
	public void removeVehicle(int slotNumber)
	{
		boolean isSlotFound = false;
		for(ParkingSlot slot : slots)
		{
			if(slot.slotNumber == slotNumber)
			{
				if(slot.occupied == true)
				{
					slot.removeVehicle();
					System.out.println("Vehicle removed successfully.");
					isSlotFound = true;
				}
				else
				{
					System.out.println("Slot is already empty.");
				}
			}
		}
		if(isSlotFound == false)
		{
			System.out.println("Invalid slot number.");
		}
	}
	public void displayAllSlots()
	{
		for(ParkingSlot slot : slots)
		{
			slot.displaySlot();
			System.out.println();
		}
	}
}




