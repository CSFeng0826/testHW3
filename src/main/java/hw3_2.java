package main;

public class hw3_2 {
	public static void main(String args[]) {
		AbstractXmasTree XmasTree1 = new XmasTree();
		
		XmasTree1.sing();
		
		AbstractXmasTree XmasTree2 = new Gift(new Bell(new Candy(XmasTree1)));
		XmasTree2.sing();
	}
}
