package com.pom.project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.utility.files.Base_Class;

public class Pom_Adactin extends Base_Class {

	public static WebDriver driver = browser_Config("chrome");
	public static Login_Page lp = new Login_Page(driver);
	public static Search_Hotel_Page sp = new Search_Hotel_Page(driver);
	public static Select_Hotel sh = new Select_Hotel(driver);
	public static Book_Hotel bh = new Book_Hotel(driver);
	public static Booking_Confirmation bc = new Booking_Confirmation(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		implicitly_Wait(5);
		get_Url("https://adactinhotelapp.com/");
		send_Keys(lp.getEmail(), "chittyrose");
		send_Keys(lp.getPassword(), "251999");
		Click(lp.getLogin_Btn());

//		select_DropDown(sp.getLocation(), "value", "Paris");
//		select_DropDown(sp.getHotels(), "value", "Hotel Sunshine");
//		select_DropDown(sp.getRoom_Type(), "value", "Deluxe");
//		select_DropDown(sp.getNum_of_Rooms(), "value", "2");
//		send_Keys(sp.getCheck_In(), "25/11/2022");
//		send_Keys(sp.getCheck_Out(), "30/11/2022");
//		select_DropDown(sp.getAdult_Room(), "value", "3");
//		select_DropDown(sp.getChild_Room(), "value", "2");
//		Click(sp.getSearch_Btn());
//
//		Click(sh.getRadio_Btn());
//		Click(sh.getContinue());
//
//		send_Keys(bh.getFirst_Name(), "Rose");
//		send_Keys(bh.getLast_Name(), "Chloe");
//		send_Keys(bh.getAddress(), "No.2,icecream road,london");
//		send_Keys(bh.getCard_No(), "1234567891012570");
//		select_DropDown(bh.getCard_Type(), "visibletext", "American Express");
//		select_DropDown(bh.getExpiry_Month(), "value", "5");
//		select_DropDown(bh.getExpir̥y_Year(), "value", "2022");
//		send_Keys(bh.getCvv_Number(), "434");
//		Click(bh.getBook_Now_Btn());
//
//		Scrollup(bc.getConfirm());
//		takes_screen(bc.getConfirm());

	}

}
