package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static Logger log = Logger.getLogger(Write_Data.class);

	public static void main(String[] args) throws IOException {

		BasicConfigurator.configure();

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("Date").createRow(0).createCell(0).setCellValue("S.No");
		wb.getSheet("Date").getRow(0).createCell(1).setCellValue("Team Members");

		wb.getSheet("Date").createRow(1).createCell(0).setCellValue(1);
		wb.getSheet("Date").getRow(1).createCell(1).setCellValue("Durga");

		wb.getSheet("Date").createRow(2).createCell(0).setCellValue(2);
		wb.getSheet("Date").getRow(2).createCell(1).setCellValue("Muthu Selvi");

		wb.getSheet("Date").createRow(3).createCell(0).setCellValue(3);
		wb.getSheet("Date").getRow(3).createCell(1).setCellValue("Nanthitha Sri");

		wb.getSheet("Date").createRow(4).createCell(0).setCellValue(4);
		wb.getSheet("Date").getRow(4).createCell(1).setCellValue("Sangeetha Priya ");

		wb.getSheet("Date").createRow(5).createCell(0).setCellValue(5);
		wb.getSheet("Date").getRow(5).createCell(1).setCellValue("Sudha");

		wb.getSheet("Date").createRow(6).createCell(0).setCellValue(6);
		wb.getSheet("Date").getRow(6).createCell(1).setCellValue("Snega");

		wb.getSheet("Date").createRow(7).createCell(0).setCellValue(7);
		wb.getSheet("Date").getRow(7).createCell(1).setCellValue("Sri Lakshmi");

		wb.getSheet("Date").createRow(8).createCell(0).setCellValue(8);
		wb.getSheet("Date").getRow(8).createCell(1).setCellValue("Sharmila");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		wb.close();

		log.info("Write Successfully");

	}

}
