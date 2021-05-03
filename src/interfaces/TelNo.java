package interfaces;

public class TelNo implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Telefon Numarasý Alýndý :" + message);
		
	}

}
