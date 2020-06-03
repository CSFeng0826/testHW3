package main;

public class hw3_1 {
	public static void main(String args[]) {
		Folder f1 = new Folder("test1");
		f1.add(new File("file1", 10.34));
		f1.add(new File("file2", 199.4));
		f1.getSize();
	}
}
