package study.designpattern.composite.basic;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu(){
		allMenus.print();
	}
}
