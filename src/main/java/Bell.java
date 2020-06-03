package main;

public class Bell extends Decorator{

	public Bell(AbstractXmasTree XmasTree) {
		super(XmasTree);
	}
	
	public void sing() {
		System.out.print("I have a bell, ");
		super.sing();
	}

}
