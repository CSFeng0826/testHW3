package main;
import java.util.ArrayList;

import java.util.ListIterator;

public class File extends AbstractFile{
	
	private double size;
	private String name;
	
	public File(){
		this.name = "";
		this.size = 0;
	}
	
	public File(String name, double size){
		this.name = name;
		this.size = size;
	}
	
	public void getSize() {
		System.out.println("File: " + this.name + ", Size: " + this.size);
	}

	public String getName() {
		return this.name;
	}
}
