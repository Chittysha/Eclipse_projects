package com.conversion.Task;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Set_To_List {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);

		List<Integer> b = new LinkedList<>(a);
		System.out.println(b);
		System.out.println(b.get(1));

	}

}
