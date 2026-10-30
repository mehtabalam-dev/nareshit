package patternPrograms;

public class Pattern19 {
	public static void main(String[] args) {
		int space = 4;
		int star = 1;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=space; j++) {
				System.out.print("   ");
			}
			for(int z = 1; z<=star;z++) {
				System.out.print(" * ");
			}
			space--;
			star+=2;
			System.out.println();
		}
	}

}
