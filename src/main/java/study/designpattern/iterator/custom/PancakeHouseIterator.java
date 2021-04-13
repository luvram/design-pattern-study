package study.designpattern.iterator.custom;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
	ArrayList<MenuItem> menuItems;
	int position = 0;

	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position < menuItems.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}


}
