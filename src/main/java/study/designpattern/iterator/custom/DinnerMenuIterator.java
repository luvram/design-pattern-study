package study.designpattern.iterator.custom;

public class DinnerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
}
