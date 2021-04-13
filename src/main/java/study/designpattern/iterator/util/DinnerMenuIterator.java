package study.designpattern.iterator.util;

import java.util.Iterator;

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

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("next()를 한번도 호출하지 않은 상태에서는 삭제할 수 없습니다.");
		}
		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}
}
