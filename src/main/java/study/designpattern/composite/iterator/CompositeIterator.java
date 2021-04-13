package study.designpattern.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack<Iterator<MenuComponent>> stack = new Stack();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		}
		Iterator<MenuComponent> iterator = stack.peek();
		if (!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		}
		return true;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if (component instanceof Menu) {
				stack.push(((Menu)component).createIterator());
			}
			return component;
		}
		return null;
	}
}
