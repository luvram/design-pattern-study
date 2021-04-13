package study.designpattern.iterator.util;

public class Main {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		CafeMenu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu, cafeMenu);

		waitress.printMenu();
	}
}
