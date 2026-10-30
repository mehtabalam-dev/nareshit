package abstractionPrograms;

public class Qsn01 {
	public static void main(String[] args) {
		int choice = 1;
		double amount = 10000;
		Payment payment = PaymentFactory.getPaymentObject(choice);
		LoanService ls = new LoanService();
		ls.clearLoan(payment, amount);
	}

}
class LoanService{
	public void clearLoan(Payment payment, double amount) {
		if(payment.pay(amount)) {
			System.out.println("Loan cleared successfully");
			System.out.println("Loan clearence certificate generated");
		}else {
			System.out.println("Payment failed. Loan not cleared");
		}
	}
}
class PaymentFactory{
	static Payment getPaymentObject(int choice) {
		switch(choice) {
		case 1 ->{
			return new UPIPayment();
		}
		case 2 ->{
			return new CreditCardPayment();
		}
		case 3 ->{
			return new CryptoPayment();
		}
		default ->{
			return null;
		}
		}
	}
}

interface Payment{
	boolean pay(double amount);
}
class UPIPayment implements Payment{

	@Override
	public boolean pay(double amount) {
		System.out.println("Payment of "+amount+" is done using UPI");
		return true;
	}
	
}
class CreditCardPayment implements Payment{

	@Override
	public boolean pay(double amount) {
		System.out.println("Payment of "+amount+" is done using CreditCard");
		return true;
	}
	
}
class CryptoPayment implements Payment{

	@Override
	public boolean pay(double amount) {
		System.out.println("Payment of "+amount+" is done using Crypto Currency");
		return true;
	}
	
}























