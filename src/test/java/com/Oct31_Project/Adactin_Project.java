package com.Oct31_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.files.Base_Class;

public class Adactin_Project extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver = browser_Config("chrome");
		maximize();
		implicitly_Wait(10);
		get_Url("https://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.xpath("//td[@align='right']//following::input[@name='username']"));
		send_Keys(username, "chittyrose");

		WebElement password = driver.findElement(By.xpath("//td[@align='right']//following::input[@type='password']"));
		send_Keys(password, "251999");

		WebElement login = driver.findElement(By.xpath("//input[@name='login' ]"));
		Click(login);
//
//		WebElement location = driver.findElement(By.xpath("//td[@width='150']//following::select[@name='location']"));
//		select_DropDown(location, "value", "Paris");
//
//		WebElement hotels = driver.findElement(By.xpath("//td[@align='right']//following::select[@name='hotels']"));
//		select_DropDown(hotels, "value", "Hotel Sunshine");
//
//		WebElement room_type = driver
//				.findElement(By.xpath("//td[@align='right']//following::select[@name='room_type']"));
//		select_DropDown(room_type, "value", "Deluxe");
//
//		WebElement number_rooms = driver
//				.findElement(By.xpath("//td[@align='right']//following::select[@name='room_nos']"));
//		select_DropDown(number_rooms, "value", "2");
//
//		WebElement date_in = driver
//				.findElement(By.xpath("//td[@align='right']//following::input[@name='datepick_in']"));
//		send_Keys(date_in, "25/11/2022");
//
//		WebElement date_out = driver
//				.findElement(By.xpath("//td[@align='right']//following::input[@name='datepick_out']"));
//		send_Keys(date_out, "30/11/2022");
//
//		WebElement adults = driver.findElement(By.xpath("//td[@align='right']//following::select[@name='adult_room']"));
//		select_DropDown(adults, "value", "3");
//
//		WebElement child = driver.findElement(By.xpath("//td[@align='right']//following::select[@name='child_room']"));
//		select_DropDown(child, "value", "2");
//
//		WebElement search = driver.findElement(By.xpath("//input[@value='Search' and @name='Submit']"));
//		Click(search);
////
////		WebElement btn = driver.findElement(By.xpath("//td[@bgcolor='#FFFFFF']//child::input[@name='radiobutton_0']"));
//		Click(btn);

		WebElement cont = driver.findElement(By.xpath("//td[@align='center']//child::input[@name='continue']"));
		Click(cont);

		WebElement frst_name = driver
				.findElement(By.xpath("//td[@align='right']//following::input[@name='first_name']"));
		send_Keys(frst_name, "Rose");

		WebElement last_name = driver
				.findElement(By.xpath("//td[@align='right']//following::input[@name='last_name']"));
		send_Keys(last_name, "Chloe");

		WebElement address = driver.findElement(By.xpath("//td[@align='right']//following::textarea[@name='address']"));
		send_Keys(address, "No.2,icecream road,london");

		WebElement card_no = driver.findElement(By.xpath("//td[@align='right']//following::input[@name='cc_num']"));
		send_Keys(card_no, "1234567891012570");
//
//		WebElement card_type = driver.findElement(By.xpath("//td[@align='right']//following::select[@name='cc_type']"));
//		select_DropDown(card_type, "visibletext", "American Express");
//
//		WebElement exp_month = driver
//				.findElement(By.xpath("//td[@align='right']//following::select[@name='cc_exp_month']"));
//		select_DropDown(exp_month, "value", "5");
//
//		WebElement exp_year = driver
//				.findElement(By.xpath("//td[@align='right']//following::select[@name='cc_exp_year']"));
//		select_DropDown(exp_year, "value", "2023");

		WebElement cvv = driver.findElement(By.xpath("//td[@align='right']//following::input[@name='cc_cvv']"));
		send_Keys(cvv, "434");
		
		WebElement book_now = driver.findElement(By.xpath("//input[@type='button' or @name='book_now']"));
		Click(book_now);
		
		Enabled(book_now);

		WebElement welcome_text = driver.findElement(By.xpath("//tr//following::td[.='Welcome to Adactin Group of Hotels']"));
		get_Text(welcome_text);

		WebElement bc = driver.findElement(By.xpath("//td[.='Booking Confirmation ']"));
		
		sleep(4000);
		Scrollup(bc);
		takes_screen(bc);
		
	}

}