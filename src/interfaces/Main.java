package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new Email(), new Filelogger(),new TelNo(),};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer ayd�n = new Customer(1," Ayd�n CAN LAZO�LU","Lazo�lu");
		
		customerManager.add(ayd�n);
		
		

	}

}
