package com.utility.files;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static String value;

	public static WebDriver driver; // ------> null

	public static WebDriver browser_Config(String browser) { /// parent----->search context

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.firefox.driver",
					"C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\src\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		return driver;
	}

	// WebElement Methods

	public static void Click(WebElement element) {
		element.click();
	}

	public static void Clear(WebElement element) {
		element.clear();
	}

	public static void send_Keys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void Enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
//		return enabled;
	}

	public static boolean Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean Selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public static void get_Text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static String get_Tagname(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	public static String get_Attribute(WebElement element, String attributeName) {
		String attribute_Value = element.getAttribute(attributeName);
		return attribute_Value;
	}

	public static Point get_Location(WebElement e) { // ----->Parent-Object
		Point location = e.getLocation();
		return location;

	}

	public static String get_CssValue(WebElement e, String value) {
		String Value = e.getCssValue(value);
		return Value;
	}

	public static Dimension get_Size(WebElement element) {
		Dimension size = element.getSize();
		return size;
	}

	public static List<WebElement> get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public static void select_DropDown(WebElement element, String type, String value) {
		Select s = new Select(element);

		switch (type) {
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			s.selectByValue(value);
			break;
		case "visibletext":
			s.selectByVisibleText(value);
			break;

		default:
			System.out.println("Wrong value");
			break;
		}

	}

	public static void Select_Drop_Down(WebElement element, String value, String type) {

		Select s = new Select(element);

		s.selectByValue(value);
	}

	// WebDriver Methods...

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void get_Url(String url) {
		driver.get(url);
	}

	public static String get_Current_Url() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String get_Title() {
		String title = driver.getTitle();
		return title;
	}

	public static String get_PageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	// Navigation commands:

	public static void navigation_Commands(String commands) {

		if (commands.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else if (commands.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (commands.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}
	}

	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}

	// Window Manage....

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void minimize() {
		driver.manage().window().minimize();
	}

	public static void full_Screen() {
		driver.manage().window().fullscreen();
	}

	public static Dimension get_Size() {
		Dimension size = driver.manage().window().getSize();
		return size;
	}

	// Cookies Manage...

	public static void delete_cookies() {
		driver.manage().deleteAllCookies();
	}

	public static void right_Clic(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).build().perform();
	}

	public static void Down() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// Alerts..

	public static void accept_Alert() {
		driver.switchTo().alert().accept();
	}

	public static void dismiss_Alert() {
		driver.switchTo().alert().dismiss();
	}

	public static String getText_Alert() {
		String text = driver.switchTo().alert().getText();
		return text;
	}

	public static void senkeys_Alert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	// JavaScriptExecutor...

	public static void Js_click(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void Js_sendkeys(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='data'", "e");
	}

	public static void Scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void Highlights(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','color:red')", e);
	}

	// ChromeOptions...

	public static void dis_notification() {

		ChromeOptions op = new ChromeOptions();

//		op.addArguments("incognito");
		op.addArguments("disable-notifications");
	}

	// Thread.Sleep..

	public static void sleep(long millisec) throws InterruptedException {
		Thread.sleep(millisec);
	}

	// Waits...

	public static void implicitly_Wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	// WebDriverWait-->FluentWait--->Wait--->Object

	public static WebDriverWait Explicitly(int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.alertIsPresent());
		return wait;
	}

	public static void pageLoad_timeout(int secs) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(secs));
	}

	// TakesScreenshot.....

	public static void takes_screen(WebElement element) throws IOException {
		// C:\Users\ELCOT\Desktop\Selenium_Sep_10am_Batch\Screen_Shot

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\Desktop\\Oct31_Project\\src\\Snap\\Pics\\logout.png");
		FileUtils.copyFile(source, des);

	}

	public static String particular_Cell_Date(String path, int sheetNo, int row, int cell) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(sheetNo);

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			value = c.getStringCellValue();

		} else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();

			// double to int

			int a = (int) d;

			// int to String

			value = String.valueOf(a);

		}

		wb.close();

		return value;

	}

}