package methodsPart02;

public class FibonacciNumber {
	
	   static void printFibonacci(int n) {
	        int a=0,b=1,c;
	        for(int i=1;i<=n;i++) {
	            System.out.print(a+" ");
	            c=a+b;
	            a=b;
	            b=c;
	        }
	    }

	    public static void main(String[] args) {
	        printFibonacci(10);
	    }

}
