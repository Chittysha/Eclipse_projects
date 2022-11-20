package com.pojo.student;

import com.Utility.variables.Utility_variables;

public class HSC {

	public static void main(String[] args) {

		Utility_variables v = new Utility_variables();

		int value = v.getAge();

		System.out.println(value); //------------->0
		
		v.setAge(17);
		
		int age = v.getAge();
		
		System.out.println(age); //--------------->17

	}

}
