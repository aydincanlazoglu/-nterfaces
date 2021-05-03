package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new Email(), new Filelogger(),new TelNo(),};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer aydýn = new Customer(1," Aydýn CAN LAZOÐLU","Lazoðlu");
		
		customerManager.add(aydýn);
		
		

	}

}
