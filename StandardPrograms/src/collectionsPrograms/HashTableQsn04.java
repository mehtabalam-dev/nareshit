package collectionsPrograms;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableQsn04 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Hospital01 hsp = new Hospital01();
		System.out.println("Enter number of patients : ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter id, name, age and disease of patient : " +(i+1));
			int patientId = Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine());
			String disease = sc.nextLine();
			hsp.registerPatient(new Patient(patientId, name, age, disease));
		}
		System.out.println("Enter patient id and new disease to update : ");
		int id = Integer.parseInt(sc.nextLine());
		String newDisease = sc.nextLine();
		hsp.updateDisease(id, newDisease);
		
		
		System.out.println("Enter oldId and new id to transfer the patient");
		int oldId = sc.nextInt();
		int newId = sc.nextInt();
		hsp.transerPatient(oldId, newId);
		
		System.out.println("Enter id to display patient details : ");
		int pid = sc.nextInt();
		hsp.displayPatient(pid);
	}
}
class Hospital01
{
	public Hashtable<Integer, Patient> patients = new Hashtable<Integer, Patient>();
	public void registerPatient(Patient p)
	{
		if(!patients.containsKey(p.patientId))
		{
			patients.put(p.patientId, p);
			System.out.println(p.name + " patient registerd successfully");
		}
		else
		{
			System.out.println("Patient ID already exists.");
		}
	}
	public void updateDisease(int id, String disease)
	{
		if(patients.containsKey(id))
		{
			patients.get(id).disease = disease;
			System.out.println(patients.get(id).name + "'s disease is updated");
		}
		else
		{
			System.out.println("Patient is not found");
		}
	}
	public void displayPatient(int id)
	{
		if(patients.containsKey(id))
		{
			System.out.println(patients.get(id));
		}
		else
		{
			System.out.println("Patient is not found");
		}
	}
	public void transerPatient(int oldId, int newId)
	{
		if(!patients.containsKey(oldId))
		{
			System.out.println("Patient not found");
		}
		else if(patients.containsKey(newId))
		{
			System.out.println("New ID already exists");
		}
		else
		{
			Patient oldValue = patients.get(oldId);
			oldValue.patientId = newId;
			patients.remove(oldId);
			patients.put(newId, oldValue);
			System.out.println(patients.get(newId).name + "'s id is updated successfully...");
		}
	}
}
class Patient
{
	public int patientId;
	public String name;
	public int age;
	public String disease;
	public Patient(int patientId, String name, int age, String disease)
	{
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "Pateint [patientId=" + patientId + ", name=" + name + 
				", age=" + age + ", disease=" + disease + "]";
	}
	
	
}