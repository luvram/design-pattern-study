package study.designpattern.iterator.custom;

public class Main {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);

		waitress.printMenu();
	}
}
