package abstractClassPrograms;

public class Qsn01 {
	public static void main(String[] args) {
		Drink d1 = new Tea();
		d1.makeDrink();
		System.out.println("--------------------");
		Drink d2 = new Coffee();
		d2.makeDrink();
		
	}

}
abstract class Drink{
	//template method provides a proper-order for method calls
	//template method should be final.
	//why? : so that sub-classes won't override
	final void makeDrink() {//templete-method
		boilWater();
		addMainItem();
		pourIntoCup();
		addExtra();
	}
	public abstract void boilWater(); 
	public abstract void addMainItem();
	public abstract void pourIntoCup();
	public abstract void addExtra();
}
class Tea extends Drink{
	public void boilWater() {
		System.out.println("Start boiling the water...");
	}
	public void addMainItem() {
		System.out.println("Adding tea powder... ");
	}
	public void pourIntoCup() {
		System.out.println("Drink poured into cup... ");
	}
	public void addExtra() {
		System.out.println("Add extra sugar...");
	}
}
class Coffee extends Drink{
	public void boilWater() {
		System.out.println("Start boiling the water...");
	}
	public void addMainItem() {
		System.out.println("Adding coffee powder... ");
	}
	public void pourIntoCup() {
		System.out.println("Drink poured into cup... ");
	}
	public void addExtra() {
		System.out.println("Add milk...");
	}
}
