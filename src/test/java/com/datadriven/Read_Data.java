package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void particular_Cell_Date() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(3);

		Cell c = r.getCell(0);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			String value = c.getStringCellValue();
			System.out.println(value);

		} else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();

			// double to int

			int a = (int) d;

			// int to String

			String value = String.valueOf(a);
			System.out.println(value);

		}

		wb.close();

	}

	public static void particular_Row_Date() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int numberOfRows = s.getPhysicalNumberOfRows();

		for (int i = 1; i < numberOfRows; i++) {
			Row r = s.getRow(i);

			Cell c = r.getCell(0);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = c.getStringCellValue();
				System.out.println(value);

			} else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();

				// double to int

				int a = (int) d;

				// int to String

				String value = String.valueOf(a);
				System.out.println(value);

			}

		}
		wb.close();
	}

	public static void particular_column_Date() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(1);

		int numberOfCells = r.getPhysicalNumberOfCells();

		for (int i = 0; i < numberOfCells; i++) {

			Cell c = r.getCell(i);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = c.getStringCellValue();
				System.out.println(value);

			} else if (type.equals(CellType.NUMERIC)) {
				double d = c.getNumericCellValue();

				// double to int

				int a = (int) d;

				// int to String

				String value = String.valueOf(a);
				System.out.println(value);

			}

		}
		wb.close();

	}

	public static void All_Data() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		int numberOfRows = s.getPhysicalNumberOfRows();

		for (int i = 1; i < numberOfRows; i++) {
			Row r = s.getRow(i);

			int numberOfCells = r.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {

					String value = c.getStringCellValue();
					System.out.println(value);

				} else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();

					// double to int

					int a = (int) d;

					// int to String

					String value = String.valueOf(a);
					System.out.println(value);

				}

			}

		}
		wb.close();

	}

	public static void main(String[] args) throws IOException {

		System.out.println("----Particular Cell Date------");
		particular_Cell_Date();

		System.out.println("----Particular Row Date------");
		particular_Row_Date();

		System.out.println("----Particular Column Date------");
		particular_column_Date();

		System.out.println("------All Data-------");
		All_Data();

	}

}
