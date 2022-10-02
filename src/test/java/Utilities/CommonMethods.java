
package Utilities;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethods extends PageInitialized {

	protected static Select select;

	/*
	 * * Method that randomString
	 *
	 * @Param int
	 * 
	 * @return String 
	 */
	public static String randomsString(int size) {
		String generateString = RandomStringUtils.randomAlphabetic(size);
		return generateString;
	}

	/// ScreenShots ///
	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" yyyy_MM_dd_HH:mm:ss");
		return sdf.format(date.getTime());
	}

	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.SREENSHOTS + filename + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}
		return picBytes;
	}

	public static byte[] takeScreenshot(String filename, WebElement element) {
		TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
		byte[] picBytes = element.getScreenshotAs(OutputType.BYTES);

		File file = element.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.SREENSHOTS + filename + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}
		return picBytes;
	}

	/*
	 * Method that select object/ product
	 * 
	 * @param List<WebElement>, String <nameForSelect>
	 */
	public static void selectObj(List<WebElement> list, String key) {
		for (WebElement option : list) {
			if (option.getText().contains(key)) {
				option.click();
				break;
			}
		}
	}

	/*
	 * Method that select object/ product
	 * 
	 * @param List<WebElement>, String <nameForSelect>
	 */
	public static void selectExactObj(List<WebElement> list, String key) {
		for (WebElement option : list) {
			if (option.getText().equals(key)) {
				option.click();
				break;
			}
		}
	}

	/*
	 * Method that wait time without condition
	 * 
	 * @param int<second:Time> 
	 */

	public static void wait(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
	/*
	 * Method that get JS alert messages
	 * 
	 * @param WebElement
	 */

	public static String getJsAlert(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", element);
		System.out.println("Alert: " + validationMessage);

		return validationMessage;
	}

	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		return js;
	}

	/*
	 * Method that click (JS)
	 * 
	 * @param WebElement
	 */
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("argument[0].click()", element);
	}

	/*
	 * Method that scroll up OR down to element (JS)
	 * 
	 * @param WebElement
	 */
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("argument[0].scrollIntoView(true)", element);
	}

	/*
	 * Method that scroll up OR down (JS)
	 * 
	 * @param int <pixel>
	 */
	public static void scrollByPixel(int pixel) {
		// scroll down => positiveNumber
		// scroll up => negativeNumber
		getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
		
	}
	
	

	/*
	 * Method that assert Text
	 * 
	 * @param WebElement , String
	 * 
	 */
	public static void verifyHeader(WebElement element, String expected) {

		Assert.assertTrue(element.getText().contains(expected));
		System.out.println("Actual: " + element.getText());
		System.out.println("Expected: " + expected);

	}

	/*
	 * Method that wait for element to be click
	 * 
	 * @param WebElement <element>
	 */
	public static WebElement waitForClickAbility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.EXPLICIR_WAIT);
		return wait;
	}

	/*
	 * Method that CLICK
	 * 
	 * @param WebElement <element>
	 */
	public static void click(WebElement element) {
		waitForClickAbility(element).click();
	}

	/*
	 * Method Hover
	 * 
	 * @param WebElement <element>
	
	 */

	public static void hover(WebElement element) {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(element).perform();

	}

	/*
	 * Method that display text from list
	 * 
	 * @param List<WebElement>
	
	 */
	public static void getTextFromList(List<WebElement> listEle) {
		for (int i = 0; i < listEle.size(); i++) {
			System.out.println(listEle.get(i).getText());

		}
	}

	/*
	 * Method Hover as List
	 * 
	 * @param List <WebElement> <element>

	 */
	public static void hoverList(List<WebElement> element) {

		for (WebElement el : element) {
			Actions act = new Actions(getDriver());
			act.moveToElement(el).build().perform();

		}
	}

	// window Handle
	/*
	 * Method switch to child window
	 *
	 * by: <yourName> modified by: <nameOfEditor <DateOfEdit> >
	 *
	 */
	public static void switchToSecondWindow() {

		String mainWindow = Driver.getDriver().getWindowHandle();
		Set<String> windows = Driver.getDriver().getWindowHandles();
		for (String eachWindow : windows) {
			if (!eachWindow.equals(mainWindow)) {
				Driver.getDriver().switchTo().window(eachWindow);
				break;
			}
		}
	}

	/*
	 * Method that clear and send text
	 *
	 * @param WebElement , String
	 *
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	
	public static void doubleClick(WebElement source) {
		Actions actions = new Actions(Driver.getDriver());
		actions.doubleClick(source).perform();
	}
	


	/*
	 * Method that input number
	 * 
	 * @param WebElement, String
	
	 */
	public static void numberInput(WebElement element, String str) {
		element.clear();
		for (int i = 0; i < str.length(); i++) {
			Keys n = null;
			if (str.charAt(i) == '0') {
				n = Keys.NUMPAD0;
			} else if (str.charAt(i) == '1') {
				n = Keys.NUMPAD1;
			} else if (str.charAt(i) == '2') {
				n = Keys.NUMPAD2;
			} else if (str.charAt(i) == '3') {
				n = Keys.NUMPAD3;
			} else if (str.charAt(i) == '4') {
				n = Keys.NUMPAD4;
			} else if (str.charAt(i) == '5') {
				n = Keys.NUMPAD5;
			} else if (str.charAt(i) == '6') {
				n = Keys.NUMPAD6;
			} else if (str.charAt(i) == '7') {
				n = Keys.NUMPAD7;
			} else if (str.charAt(i) == '8') {
				n = Keys.NUMPAD8;
			} else if (str.charAt(i) == '9') {
				n = Keys.NUMPAD9;
			}
			element.sendKeys(n);
		}
	}

	/*
	 * Method that get title
	 *
	 * return String
	 */
	public static String getTitle() {
		return driver.getTitle();
	}
	
	///// iframe
	/*
	 * Method switch frame by nameOrId
	 *
	 * by: <yourName> modified by: <nameOfEditor <DateOfEdit> >
	 *
	 */

	public static void switchToFrame(String nameOrId) {

		try {

			Driver.getDriver().switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Method switch frame by WebElement
	 *
	 * by: <yourName> modified by: <nameOfEditor <DateOfEdit> >
	 *
	 */
	public static void switchToFrame(WebElement element) {

		try {

			Driver.getDriver().switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Method switch frame by Index
	 *
	 * by: <yourName> modified by: <nameOfEditor <DateOfEdit> >
	 *
	 */
	public static void switchToFrame(int index) {

		try {

			Driver.getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Method that check if element is clickAble
	 *
	 * by: <yourName> modified by: <nameOfEditor <DateOfEdit> >
	 *
	 */
	public static boolean isClickable(WebElement el) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.EXPLICIR_WAIT);
			wait.until(ExpectedConditions.elementToBeClickable(el));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isClickable(List<WebElement> el) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.EXPLICIR_WAIT);
			wait.until(ExpectedConditions.visibilityOfAllElements(el));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 
	 * Method that getAvailable from out of stock
	
	 * 
	 * @param List<WebElement>listA
	 * @param List<WebElement>listB
	 * @return int
	 */
	public static int getAvailable(List<WebElement> listA, List<WebElement> listB) {

		return listA.size() - listB.size();
	}

	/**
	 * Method that getAvailable from out of stock
	 * 
	 * 
	 * @param int a
	 * @param int b
	 * @return int
	 */
	public static int getAvailable(int a, int b) {

		return a - b;
	}

	/*
	 * Method that dismiss Alert
	 * 
	 */
	public static void dismissAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Method that accept Alert
	 * 
	 */
	public static void acceptAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}


	/*
	 * Method that take out symbol price
	 * 
	 * @PARAM WebElement element RETURN double
	 * 
	 */
	public static double getPriceAsInt(WebElement element) {
		return Double.parseDouble(element.getText().substring(1));
	}

	/*
	 * Method that select static dropDown by visible name

	 *  @PARAM WebElement
	 *  @PARAM String name
	 *  
	 */
	public static void selectDropDown(WebElement ele, String name) {
		
		select = new Select(ele);
		select.selectByVisibleText(name);

	}


}









