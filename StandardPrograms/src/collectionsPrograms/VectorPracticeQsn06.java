package collectionsPrograms;

import java.util.Vector;

public class VectorPracticeQsn06 
{
	public static void main(String[] args)
	{
		Hospital apollo = new Hospital();
		apollo.addEquipment(new MedicalEquipment(101, "ECG Machine"));
		apollo.addEquipment(new MedicalEquipment(102, "Wheelchair"));
		apollo.addEquipment(new MedicalEquipment(103, "Oxygen Concentrator"));
		
		apollo.issueEquipment(102);
		apollo.issueEquipment(102);
		apollo.returnEquipment(102);
		
		apollo.displayAllEquipment();
	}
}
class MedicalEquipment
{
	public int equipmentId;
	public String equipmentName;
	public boolean available = true;
	public MedicalEquipment(int equipmentId, String equipmentName) 
	{
		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
	}
	public boolean issueEquipment()
	{
		if(available)
		{
			available = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	public void returnEquipment()
	{
		if(available == false)
		{
			available = true;
		}
	}
	public void displayEquipment()
	{
		System.out.println("Id = "+equipmentId);
		System.out.println("Name = "+equipmentName);
		System.out.println("Availability status = "+available);
	}
}
class Hospital
{
	public Vector<MedicalEquipment> equipmentList = new Vector<MedicalEquipment>();
	
	public void addEquipment(MedicalEquipment equipment)
	{
		equipmentList.add(equipment);
		System.out.println(equipment.equipmentName+" is added to equiment list");
	}
	public void issueEquipment(int equipmentId)
	{
		boolean isEquipmentFound = false;
		for(MedicalEquipment e : equipmentList)
		{
			if(e.equipmentId == equipmentId)
			{
				if(e.available)
				{
					e.issueEquipment();
					System.out.println("Equipment issued successfully.");
				}
				else
				{
					System.out.println("Equipment is currently unavailable.");
				}
				isEquipmentFound = true;
			}
		}
		if(isEquipmentFound ==false)
		{
			System.out.println("Equipment not found.");
		}
	}
	public void returnEquipment(int equipmentId)
	{
		boolean isEquipmentFound = false;
		for(MedicalEquipment e : equipmentList)
		{
			if(e.equipmentId == equipmentId)
			{
				if(!e.available)
				{
			
					e.returnEquipment();
					System.out.println("Equipment returned successfully.");
				}
				else
				{
					System.out.println("Equipment is already available.");
				}
			}
			isEquipmentFound = true;
		}
		if(isEquipmentFound == false)
		{
			System.out.println("Equipment not found.");
		}
	}
	public void displayAllEquipment() 
	{
		for(MedicalEquipment e : equipmentList)
		{
			e.displayEquipment();
			System.out.println();
		}
	}
}










