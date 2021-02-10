package voilation;

public class Robots implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("Robot: Start woork");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot: Stop work");
		
	}

	@Override
	public void startEat() {
		System.out.println("Robot: Start eat");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Robot: Stop eat");
		
	}

}
