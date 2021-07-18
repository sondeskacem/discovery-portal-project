package com.discoveryPortal.e2eTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CommunMethods {

	public static WebDriver driver;
	public static Properties prop;
	public CommunMethods() {
		driver = Setup.driver;
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	public void scrolllerBottom() {

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)", "");
	}

	public void openApplicationWithConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}

	public void mouseHover(WebElement element) {

		Actions actions = new Actions(driver);
		WebElement mouseHover = element;
		actions.doubleClick(mouseHover).perform();
	}
	// Click Method by usingJAVA Generic
	public <T> void click(T elementAttr) {
		if (elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By) elementAttr).click();
		} else {
			((WebElement) elementAttr).click();
		}
	}

	// Write Text by using JAVA Generic
	public <T> void writeText(T elementAttr, String text) {
		if (elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By) elementAttr).sendKeys(text);
		} else {
			((WebElement) elementAttr).sendKeys(text);
		}
	}

	// Read Text by using JAVA Generic
	public <T> String readText(T elementAttr) {
		if (elementAttr.getClass().getName().contains("By")) {
			return driver.findElement((By) elementAttr).getText();
		} else {
			return ((WebElement) elementAttr).getText();
		}
	}

	public void selectDropDownListByVisibleText(WebElement element, String text) {
		Select dropDownList = new Select(element);
		dropDownList.selectByVisibleText(text);
	}

	public void selectDropDownListByVisibleIndex(WebElement element, int index) {
		Select dropDownIndex = new Select(element);
		dropDownIndex.selectByIndex(index);
	}

	public void selectDropDownListByValue(WebElement element, String text) {
		Select dropDownValue = new Select(element);
		dropDownValue.selectByVisibleText(text);
	}

	public void dragAndDrop(WebElement element1, WebElement element2) {

		Actions actions = new Actions (driver);
		WebElement from = element1;
		WebElement to = element2;
		actions.dragAndDrop(from, to).perform();
	}

	public void verifyIfElementIsDisplayed(WebElement element) {

		WebElement displayedElement = element;
		boolean status = displayedElement.isDisplayed();
		System.out.println(status);
	}

	public void clickElementWithJavascriptExecutor(WebElement web_element) {
		WebElement element = web_element;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void refrech() {
		driver.navigate().refresh();
	}
}
