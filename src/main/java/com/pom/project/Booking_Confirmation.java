package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public WebDriver driver; // ------------> null

	@FindBy(xpath = "//td[.='Booking Confirmation ']")
	private WebElement confirm;

	@FindBy(xpath = "//td[@class='welcome_menu']//following::a[.='Logout']")
	private WebElement logout;

	public Booking_Confirmation(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getLogout() {
		return logout;
	}

}
