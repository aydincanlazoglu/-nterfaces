package interfaces;

public class TelNo implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Telefon Numaras� Al�nd� :" + message);
		
	}

}
