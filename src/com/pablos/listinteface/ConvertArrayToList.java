package com.pablos.listinteface;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertArrayToList {

	public static void main(String[] args) {
		String[] items = { "sword", "arc", "wand", "hammer", "bread", "pen", "pets" };
		LinkedList<String> itemList = new LinkedList<String>(Arrays.asList(items));

		itemList.add("something");
		itemList.addFirst("first");
		itemList.add(2, "index2");
		itemList.addLast("last");

		items = itemList.toArray(new String[itemList.size()]);

		for (String n : items)
			System.out.printf("%s ", n);
	}

}
