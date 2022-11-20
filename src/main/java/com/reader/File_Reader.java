package com.reader;

import java.io.IOException;

public class File_Reader {

	private File_Reader() {

	}

	public static File_Reader getInstanceFR() {

		File_Reader reader = new File_Reader();
		return reader;

	}

	public TestData_Reader getInstanceTD() throws IOException {

		TestData_Reader reader = new TestData_Reader();
		return reader;

	}

}
