package methodsPart03;

public class Demo {
	
	public static void main(String[] args) {
//		getPi();
		System.out.println(getPi());
	}
	
	public static int getPi() {
		System.out.println("Hello");
		int i = 10;
		if(i<2) {
			return 4;
		}
		System.out.println("Bye");
		return 0;
	}

}
