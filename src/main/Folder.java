package main;

import java.util.ArrayList;

import java.util.ListIterator;

public class Folder extends AbstractFile{
	ArrayList files;
	private String name;
	
	public Folder(){
		files = new ArrayList<AbstractFile>();
		this.name = "";
	}
	
	public Folder(String name){
		files = new ArrayList<AbstractFile>();
		this.name = name;
	}
	
	public void add(AbstractFile file) {
		files.add(file);
	}
	
	public void getSize() {
		System.out.println("Folder: " + this.name);
		ListIterator <AbstractFile> iterator = files.listIterator();
		while (iterator.hasNext()){
			AbstractFile f = iterator.next();
			f.getSize();
		}
	}

	public String getName() {
		return this.name;
	}
	
}
