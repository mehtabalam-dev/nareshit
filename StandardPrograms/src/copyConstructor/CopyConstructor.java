package copyConstructor;

public class CopyConstructor {
	public static void main(String[] args) {
		A ob1 = new A(10,20);
		A ob2 = new A(ob1);
		System.out.println(ob2.x+"==========="+ob2.y);
	}

}
class A{
	public int x;
	public int y;
	
	public A(int x, int y) {
		
		this.x= x;
		this.y = y;
	}
	
	public A(A ob) {
		
		this.x= ob.x;
		this.y = ob.y;
	}
}