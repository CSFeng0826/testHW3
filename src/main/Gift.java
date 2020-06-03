package main;

public class Gift extends Decorator{

	public Gift(AbstractXmasTree XmasTree) {
		
		super(XmasTree);
	}
	
	public void sing() {
		System.out.print("I have a gift, ");
		super.sing();
	}

}
