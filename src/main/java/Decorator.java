package main;

public abstract class Decorator extends AbstractXmasTree{
	public AbstractXmasTree XmasTree;
	
	public Decorator(AbstractXmasTree XmasTree) {
		this.XmasTree = XmasTree;
	}
	
	public void sing() {
		this.XmasTree.sing();
	}
	
}
