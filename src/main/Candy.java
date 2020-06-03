package main;

public class Candy extends Decorator{

	public Candy(AbstractXmasTree XmasTree) {
		super(XmasTree);
	}
	
	public void sing() {
		System.out.print("I have a candy, ");
		super.sing();
	}

}
