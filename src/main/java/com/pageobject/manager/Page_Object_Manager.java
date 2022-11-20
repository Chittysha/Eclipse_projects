package com.pageobject.manager;

import org.openqa.selenium.WebDriver;

import com.pom.project.Book_Hotel;
import com.pom.project.Booking_Confirmation;
import com.pom.project.Login_Page;
import com.pom.project.Search_Hotel_Page;
import com.pom.project.Select_Hotel;

public class Page_Object_Manager {

	public WebDriver driver; // ----> null

	private Login_Page login;
	private Search_Hotel_Page search;
	private Select_Hotel select;
	private Book_Hotel book;
	private Booking_Confirmation confirm;

	public Page_Object_Manager(WebDriver driver2) {
		driver = driver2;
	}

	public Login_Page getLogin() {

		if (login == null) {
			login = new Login_Page(driver);
		}
		return login;
	}

	public Search_Hotel_Page getSearch() {
		if (search == null) {
			search = new Search_Hotel_Page(driver);
		}
		return search;
	}

	public Select_Hotel getSelect() {
		if (select == null) {
			select = new Select_Hotel(driver);
		}
		return select;
	}

	public Book_Hotel getBook() {
		if (book == null) {
			book = new Book_Hotel(driver);
		}
		return book;
	}

	public Booking_Confirmation getConfirm() {
		if (confirm == null) {
			confirm = new Booking_Confirmation(driver);
		}
		return confirm;
	}

}
