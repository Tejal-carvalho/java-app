package voilation;

public class Managers implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("Managers: Start woork");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Managers: Stop work");
		
	}

	@Override
	public void startEat() {
		System.out.println("Managers: Start eat");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Managers: Stop eat");
		
	}

}
