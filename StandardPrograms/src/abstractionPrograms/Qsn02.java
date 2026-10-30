package abstractionPrograms;

import java.util.Scanner;

public class Qsn02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the message");
		String msg = sc.nextLine();
		MessageService ms = MessageFactory.getImplementationObject(choice);
		NotificationService ns = new NotificationService();
		ns.notifyUser(ms, msg);
	}

}
/**
 * System-01
 * you have NotificationService class which depends on Interface 
 * not on implementation classes.
 * Where is the abstraction? what are we are hiding from this System-01(NotificationService)?
 * Answer : System-01 knows only interface and its methods. here implementation of these 
 * abstract methods are hidden from this System-01.
 *  */
class NotificationService{
	public void notifyUser(MessageService service, String message) {
		if(service.sendMessage(message)) {
			System.out.println("Notification sent successfully.");
			System.out.println("With message : "+message);
		}else {
			System.out.println("Notification failed.");
		}
	}
}

/**
 * Factory Class
 * Factory class is a class which contains factory method.
 * What is factory method?
 * it is a static method which creates and returns the object of implementation
 * classes of an interface
 */
class MessageFactory{
	public static MessageService getImplementationObject(int choice) {
		MessageService obj = null;
		switch(choice) {
		case 1 -> {
			obj =  new EmailService();
		}
		case 2 -> {
			obj =  new SMSService();
		}
		case 3 -> {
			obj =  new WhatsappService();
		}
		
		}
		return obj;
	}
}
/**
 * System-02
 * it defines the design with an interface and its implement*/
interface MessageService{
	boolean sendMessage(String message);
}
class EmailService implements MessageService{
	@Override
	public boolean sendMessage(String message) {
		System.out.println("Message sent  via Email...");
		return true;
	}
}
class SMSService implements MessageService{

	@Override
	public boolean sendMessage(String message) {
		System.out.println("Message sent via SMS...");
		return true;
	}
	
}
class WhatsappService implements MessageService{

	@Override
	public boolean sendMessage(String message) {
		System.out.println("Message sent via Whatsapp...");
		return true;
	}
	
}