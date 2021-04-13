package study.designpattern.iterator.util;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
