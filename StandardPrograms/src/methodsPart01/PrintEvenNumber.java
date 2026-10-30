package methodsPart01;

public class PrintEvenNumber {
	static void printEvenNumbers() {
		for(int i = 1; i<= 20; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		printEvenNumbers();
	}

}
