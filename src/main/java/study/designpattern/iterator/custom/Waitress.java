package study.designpattern.iterator.custom;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinnerMenu dinnerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}

	public void printMenu() {
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerMenuIterator = dinnerMenu.createIterator();
		System.out.println("메뉴\n---\n아침메뉴");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("\n점심메뉴");
		printMenu(dinnerMenuIterator);

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
