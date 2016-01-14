package com.pablos.listinteface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOfCollection {

	public static void main(String[] args) {
		String[] items = { "sword", "arc", "wand", "hammer", "bread", "pen", "pets" };
		List<String> list = Arrays.asList(items);

		Collections.sort(list);
		System.out.printf("%s ", list);
		System.out.println();
		
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.printf("%s ",list);
		System.out.println();
		
		Collections.replaceAll(list, "sword", "hunt");
		Collections.sort(list);
		System.out.printf("%s ",list);
		System.out.println();
		

	}

}
