package com.testng.attributes;

import org.testng.annotations.Test;

public class DependsOn {

	@Test
	private void laptop() {
		System.out.println("laptop");
		System.out.println(10 / 0);
	}

	@Test
	private void earphones() {
		System.out.println("Earphones");
	}

	@Test(dependsOnMethods = "laptop", alwaysRun = true)
	private void amazonkit() {
		System.out.println("Amazon kit");
	}

}
