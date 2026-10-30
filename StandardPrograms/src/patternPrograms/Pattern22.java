package patternPrograms;

public class Pattern22 {
	public static void main(String[] args) {
		int space = 4;
		int star = 1;
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=space; j++) {
				System.out.print("   ");
			}
			for(int z = 1; z<=star;z++) {
				System.out.print(" * ");
			}
			if(i<=4) {
				space--;
				star++;
			}else {
				space++;
				star--;
			}
			System.out.println();
		}
	}

}

