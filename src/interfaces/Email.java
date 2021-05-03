package interfaces;

public class Email implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Posta Gmailinize Eklendi:" + message);
		
	}

}
