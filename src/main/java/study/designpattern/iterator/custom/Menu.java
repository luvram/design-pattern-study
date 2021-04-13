package study.designpattern.iterator.custom;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
