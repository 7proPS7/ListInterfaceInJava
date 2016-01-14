package com.pablos.listinteface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleArrayList {

	public static void main(String[] args) {

		List<String> mlist = new ArrayList<>();

		// add elements to the list
		mlist.add("Tom 1");
		mlist.add("Adele 2");
		mlist.add("John 3");
		mlist.add("Andrea 4");
		mlist.add("Paul 5");

		System.out.println("List size is : " + mlist.size() + "\n");

		// Use Iterator in while loop
		Iterator<String> iter = mlist.iterator();
		while (iter.hasNext()) {
			Object next = iter.next();
			System.out.println("Who: " + next);
		}
		System.out.println();

		// You can use for each loop
		for (Object element : mlist) {
			System.out.println("Who: " + element);
		}
		System.out.println();

		// Other for each loop statement
		mlist.stream().forEach((element) -> {
			System.out.println("Who: " + element);
		});
		System.out.println();

		// The last with functional looping style , filtering, grouping etc.
		// find TOM
		mlist.parallelStream().filter(str -> str.contains("Tom")).forEach((element) -> {
			System.out.println("Who: " + element);
		});

		// Use CLEAR method to
		mlist.clear();

	}
}
