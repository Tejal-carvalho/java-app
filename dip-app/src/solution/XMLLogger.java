package solution;

public class XMLLogger implements ILog{
	public void log(String ErrorMessage) {
		System.out.println("writing data in XML file..\n" + ErrorMessage);
	}


}
