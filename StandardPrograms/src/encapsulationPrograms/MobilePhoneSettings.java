package encapsulationPrograms;


import java.util.*;

	class MobilePhone
	{
	    private String brand;
	    private String model;
	    private int volume;
	    private int batteryPercentage;



	    public void setBrand(String brand)
	    {
	      this.brand = brand;
	    }

	    public String getBrand()
	    {
	      return brand;
	    }

	    public void setModel(String model)
	    {
	      this.model = model;
	    }

	    public String getModel()
	    {
	      return model;
	    }

	    public void setVolume(int volume)
	    {
	      if(volume <0 || volume >100)
	      {
	    	  	this.volume = 0;
	      }
	      else
	      {
	        this.volume=volume;
	      }
	    }

	    public int getVolume()
	    {
	      return volume;
	    }

	    public void setBatterypercentage(int batteryPercentage)
	    {
	      if(batteryPercentage <0 || batteryPercentage >100)
	      {
	    	  	this.batteryPercentage = 0;
	      }
	      else
	      {
	    	  	this.batteryPercentage=batteryPercentage;
	      }
	    }

	    public int getBatterypercentage()
	    {
	      return batteryPercentage;
	    }

	    public void displayDetails()
	    {
	      System.out.println("Brand = "+getBrand());
	      System.out.println("Model = "+getModel());
	      System.out.println("Volume = "+getVolume());
	      System.out.println("Battery = "+getBatterypercentage());
	    }
	}

	public class MobilePhoneSettings 
	{
	    public static void main(String[] args)
	    {
	      Scanner sc = new Scanner(System.in);
	      String brand = sc.nextLine();
	      String model = sc.nextLine();
	      int volume = sc.nextInt();
	      int batteryPercentage = sc.nextInt();

	      MobilePhone obj = new MobilePhone();
	      obj.setBrand(brand);
	      obj.setModel(model);
	      obj.setVolume(volume);
	      obj.setBatterypercentage(batteryPercentage);
	      System.out.println("Mobile Details: ");
	      obj.displayDetails();


	    }
	}

