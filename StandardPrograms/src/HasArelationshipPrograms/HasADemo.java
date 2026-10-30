package HasArelationshipPrograms;


/*
 * 
 * composition example
 */
public class HasADemo {
	public static void main(String[] args) {
		Engine eng = new Engine("Petrol",1.5);
		Car c = new Car("Honda","Black",150,eng);
		c.displayDetails();
	}

}

class Car{
	String company;
	String color;
	double topSpeed;
	Engine engine;
	public Car(String company, String color, double topSpeed, Engine engine) {
		this.company = company;
		this.color = color;
		this.topSpeed = topSpeed;
		this.engine = engine;
	}
	
	public void displayDetails() {
		System.out.println("Company Name: "+company);
		System.out.println("Color: "+color);
		System.out.println("Top speed: "+topSpeed);
		System.out.println("Engine details: ");
		engine.displayDetails();
	}
	
	
}
class Engine{
	String fuelType;
	double cc;
	public Engine(String fuelType, double cc) {
		this.fuelType = fuelType;
		this.cc = cc;
	}
	
	public void displayDetails() {
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Engine capacity: "+cc);
	}
	
}
