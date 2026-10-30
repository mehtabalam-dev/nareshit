package part03Programs;

public class InnerClass 
{
	public static void main(String[] args)
	{
		// non-static inner class
//		Car car = new Car();
//		Car.Engine eng = car.new Engine(200,15);
//		System.out.println(eng);
//		System.out.println(car);
//		Car.Engine eng = new Car().new Engine(200, 15);
//		System.out.println(eng);
//		System.out.println(new Car());
		
		
		// second constructor
//		Car car = new Car();
//		Car.Engine eng = car.new Engine(200,15);
//		car.name = "i20";
//		car.engine = eng;
//		System.out.println(eng);
//		System.out.println(car);
		
//		Car.Engine eng = new Car().new Engine(200, 15);
//		Car car = new Car("i20", eng);
//		System.out.println(eng);
//		System.out.println(car);
		
		
		
		// static inner class
//		Car.Engine eng = new Car.Engine(200, 15);
//		Car car = new Car("i20",eng);
//		System.out.println(eng);
//		System.out.println(new Car());
//		System.out.println(car);
	}
}
class Car
{
	static class Engine
	{
		public int hp;
		public double milage;
		public Engine(int hp,double milage)
		{
			this.hp = hp;
			this.milage = milage;
		}
		public String toString()
		{
			return "Engine [hp = " + hp + ", milage = " + milage + "]";
		}
	}

	public String name;
	public Engine engine;
	public Car() {}
	public Car(String name,Engine engine)
	{
		this.name = name;
		this.engine = engine;
	}
	public String toString()
	{
		return "Car [name=" + name + ", engine= " + engine + "]";
	}
 
}