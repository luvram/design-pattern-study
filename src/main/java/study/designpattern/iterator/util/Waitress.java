package study.designpattern.iterator.util;

import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerMenuIterator = dinnerMenu.createIterator();
		Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();
		System.out.println("메뉴\n---\n아침메뉴");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("\n점심메뉴");
		printMenu(dinnerMenuIterator);
		System.out.println("\n저녁메뉴");
		printMenu(cafeMenuIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
