package voilation;

public class VoilationTest {

	public static void main(String[] args) {
		Managers m = new Managers();
		Robots r = new Robots();
		printInfo(m);
		printInfo(r);

	}

	private static void printInfo(IWorkable obj) {
		obj.startEat();
		obj.stopEat();
		obj.startWork();
		obj.stopWork();

	}

}
