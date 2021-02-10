package solution;

public class Managers implements IWork,IEat {

	@Override
	public void startEat() {
		System.out.println("Manager: start eat");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Manager: stop eat");
		
	}

	@Override
	public void startWork() {
		System.out.println("Manager: start work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Manager: stop work");
		
	}

}
