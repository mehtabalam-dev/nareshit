package abstractClassPrograms;

public class Qsn02 {
	public static void main(String[] args) {
		ATM op1 = new Withdraw();
		op1.process();
		System.out.println();
		System.out.println("----------------");
		ATM op2 = new Deposit();
		op2.process();
		System.out.println();
		System.out.println("----------------");
		ATM op3 = new ChecKBalance();
		op3.process();
	}

}
abstract class ATM{
	// template-method
	final public void process() {
		insertCard();
		enterPin();
		doTransaction();
		printReceipt();
	}
	public void insertCard() {
		System.out.println("Card is inserted...!!!");
	}
	public void enterPin() {
		System.out.println("Pin entered successfully...!!!");
	}
	public abstract void doTransaction();
	public void printReceipt() {
		System.out.println("Receipt is printed...!!!");
	}
}
class Withdraw extends ATM{

	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Amount is withdrawn succcessfully..!!");
	}
}
class Deposit extends ATM{

	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Amount is deposited successfully..!!");
	}
}
class ChecKBalance extends ATM{

	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Checked the available balance successfully..!!");
	}
	
}
