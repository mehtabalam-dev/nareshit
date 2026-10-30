package classAndObject;

import java.util.Scanner;

public class Qsn05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------");
		String brand = sc.nextLine();
		double price = sc.nextDouble();
		double batteryPercentage = sc.nextDouble();
		Mobile m1 = new Mobile(brand, price, batteryPercentage);
		m1.displayDetails();
	}

}
class Mobile{
	public String brand; 
	public double price;
	public double batteryPercentage;
	
	
	public Mobile(String brand,double price,double batterPercentage) {
		this.brand = brand;
		this.price = price;
		this.batteryPercentage = batterPercentage;
		
	}
	
	public double chargeBattery(double batteryPercentage) {
		double chargeI = batteryPercentage + this.batteryPercentage; 
		return chargeI;
	}
	
	public double useMobile(double batteryPercentage) {
		double chargeD = batteryPercentage - this.batteryPercentage; 
		return chargeD;
	}
	
	public void displayDetails() {
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("battery Percentage : "+batteryPercentage);
	}
}
