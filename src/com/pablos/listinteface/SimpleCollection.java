package com.pablos.listinteface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SimpleCollection {

	public static void main(String[] args) {
		String[] items = { "sword", "arc", "wand", "hammer" };
		List<String> itemList = new ArrayList<String>();

		for (String it : items)
			itemList.add(it);

		String[] itemsMore = { "hammer", "sword" };
		List<String> itemList2 = new ArrayList<String>();

		for (String its : itemsMore) {
			itemList2.add(its);
		}

		for (int i = 0; i < itemList.size(); i++) {
			System.out.printf("%s ", itemList.get(i) + ", ");
		}
		System.out.println();
		for (int i = 0; i < itemList2.size(); i++) {
			System.out.printf("%s ", itemList2.get(i) + ", ");
		}

		listEdit(itemList, itemList2);
		System.out.println();

		for (int i = 0; i < itemList.size(); i++) {
			System.out.printf("%s ", itemList.get(i) + ", ");
		}

	}

	private static void listEdit(Collection<String> itemList, Collection<String> itemList2) {
		Iterator<String> iter = itemList.iterator();
		while (iter.hasNext()) {
			if (itemList2.contains(iter.next()))
				iter.remove();
		}
	}

}
