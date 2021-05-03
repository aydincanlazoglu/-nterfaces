package interfaces;

public class  Filelogger  implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Dosya gönderildi : " + message);
		
	}

}
