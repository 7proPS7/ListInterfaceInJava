package com.pablos.listinteface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SimpleLinkedList {

	public static void main(String[] args) {
		String[] items = { "sword", "arc", "wand", "hammer", "bread", "pen", "pets" };
		List<String> itemList = new LinkedList<String>();

		for (String it : items)
			itemList.add(it);

		String[] itemsMore = { "wood", "hammer", "bread", "water" };
		List<String> itemList2 = new LinkedList<String>();
		for (String its : itemsMore)
			itemList2.add(its);

		itemList.addAll(itemList2);

		itemList2 = null;

		printItemList(itemList);
		removeItems(itemList, 3, 5);
		printItemList(itemList);
		reverseItemList(itemList);

	}

	private static void reverseItemList(List<String> itemList) {
		ListIterator<String> iter = itemList.listIterator(itemList.size());
		while (iter.hasPrevious()) {
			System.out.printf("%s ", iter.previous());
		}
		System.out.println();
	}

	private static void removeItems(List<String> itemList, int fromIndex, int toIndex) {
		itemList.subList(fromIndex, toIndex).clear();
	}

	private static void printItemList(List<String> itemList) {
		for (String it : itemList)
			System.out.printf("%s ", it);
		System.out.println();
	}

}
