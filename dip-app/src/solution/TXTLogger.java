package solution;

public class TXTLogger implements ILog{
	public void log(String ErrorMessage) {
		System.out.println("writing data in TXT file..\n" + ErrorMessage);
	}


}
