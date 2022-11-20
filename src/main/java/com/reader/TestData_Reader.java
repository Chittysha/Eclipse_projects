package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData_Reader {

	public static Properties p;

	public TestData_Reader() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\TestData.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String get_Url() {
		String url = p.getProperty("Url");
		return url;
	}

	public String get_Username() throws IOException {
		String username = p.getProperty("username");
		return username;
	}

	public String get_Password() throws IOException {
		String password = p.getProperty("password");
		return password;
	}

	public String get_Location() {

		String location = p.getProperty("location");
		return location;
	}

	public String get_Hotel() {

		String hotel = p.getProperty("hotel");
		return hotel;
	}

	public String get_RoomType() {
		String roomtype = p.getProperty("roomtype");
		return roomtype;
	}

	public String get_NumOfRooms() {
		String numofrooms = p.getProperty("numofrooms");
		return numofrooms;
	}

	public String get_CheckIn() {
		String check_In = p.getProperty("checkIn");
		return check_In;
	}

	public String get_CheckOut() {
		String check_Out = p.getProperty("checkOut");
		return check_Out;
	}

	public String get_AdultRoom() {

		String adultroom = p.getProperty("adultroom");
		return adultroom;
	}

	public String get_ChildRoom() {

		String childroom = p.getProperty("childroom");
		return childroom;
	}

	public String get_FirstName() {
		String first_name = p.getProperty("firstName");
		return first_name;

	}

	public String get_LastName() {
		String Last_name = p.getProperty("lastName");
		return Last_name;
	}

	public String get_Address() {
		String address = p.getProperty("Address");
		return address;
	}

	public String get_CardNo() {
		String cardNo = p.getProperty("CardNo");
		return cardNo;

	}

	public String get_CardType() {

		String cardType = p.getProperty("CardType");
		return cardType;
	}

	public String get_ExpiryMonth() {
		String ExpiryMonth = p.getProperty("ExpiryMonth");
		return ExpiryMonth;

	}

	public String get_ExpiryYear() {

		String ExpiryYear = p.getProperty("ExpiryYear");
		return ExpiryYear;
	}

	public String get_CvvNo() {
		String Cvv_No = p.getProperty("CvvNo");
		return Cvv_No;
	}

	public String get_Id() {
		String Id = p.getProperty("email");
		return Id;
	}

}
