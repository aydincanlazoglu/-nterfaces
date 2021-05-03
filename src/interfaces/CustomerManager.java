package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi" + customer.getFistName());
		
		Utils utils = new Utils();
		utils.RunLoggers(loggers, customer.getFistName());
		
		for(Logger logger: loggers) {
			logger.log(customer.getFistName());
		}
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi" + customer.getFistName());
		
		for(Logger logger: loggers) {
			logger.log(customer.getFistName());
		}
	}
}
