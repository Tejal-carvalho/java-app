package solution;

public class SolutionTest {

	public static void main(String[] args) {
		Managers m = new Managers();
		Robots r = new Robots();
		printInfo(m);
		printInfo(r);
	}

	private static void printInfo(Robots r) {
		r.startWork();
		r.stopWork();
	}

	private static void printInfo(Managers m) {
		m.startWork();
		m.stopWork();
		m.startEat();
		m.stopEat();

	}
}
