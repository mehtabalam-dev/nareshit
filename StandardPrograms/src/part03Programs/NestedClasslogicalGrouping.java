package part03Programs;

public class NestedClasslogicalGrouping 
{
	public static void main(String[] args)
	{
	
	        Hospital hospital = new Hospital();

	        // Creating Doctor object
	        Hospital.Doctor doctor = hospital.new Doctor();

	        // Creating Patient object
	        Hospital.Patient patient = hospital.new Patient();

	        // Creating Pharmacy object
	        Hospital.Pharmacy pharmacy = hospital.new Pharmacy();

	        doctor.treatPatient();
	        patient.checkDetails();
	        pharmacy.provideMedicine();
	    }
	}

	// Outer class
	class Hospital {

	    // Inner class 1
	    class Doctor {

	        void treatPatient() {
	            System.out.println("Doctor is treating the patient...");
	        }
	    }

	    // Inner class 2
	    class Patient {

	        void checkDetails() {
	            System.out.println("Patient details are being checked...");
	        }
	    }

	    // Inner class 3
	    class Pharmacy {

	        void provideMedicine() {
	            System.out.println("Pharmacy is providing medicine...");
	        }
	    }
	}
	