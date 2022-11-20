package com.conversion.Task;

import java.util.ArrayList;

public class String_To_List {

	public static void main(String[] args) {
		String[] s = { "Java", "Selenium", "Maven" };
		System.out.println(s.length);

		ArrayList<String> List = new ArrayList<>();
		for (String string : s) {
			List.add(string);
		}

		System.out.println(List);
	}

}
