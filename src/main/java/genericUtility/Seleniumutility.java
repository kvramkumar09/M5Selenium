package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Seleniumutility {

	public void implicitWait(WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}

	/**
	 * This is a generic method to select an option in a dropdown using the Index
	 * @param element
	 * @param valueAttribute
	 */

	public void selectOptionByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * This is a generic method to select an option in a dropdown using the value
	 * @param element
	 * @param valueAttribute
	 */


	public void selectOptionByValue(WebElement element, String valueAttribute) {
		Select sel = new Select(element);
		sel.selectByValue(valueAttribute);
	}

	/**
	 * This is a generic method to select an option in a dropdown using the visible text
	 * @param element
	 * @param valueAttribute
	 */

	public void selectOptionByVisibleText(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}


	/**
	 * This is a generic method to mouse hover to an Element
	 * @param element
	 * @param valueAttribute
	 */

	public void mouseHovering(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to switch the driver control to a frame based on its index
	 * @param element
	 * @param valueAttribute
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * This is a generic method to switch the driver control to a frame based on its name or ID attributes
	 * @param element
	 * @param valueAttribute
	 */
	public void switchToFrame(WebDriver driver, String nameorIdAttribute) {
		driver.switchTo().frame(nameorIdAttribute);
	}
	
	/**
	 * This is a generic method to switch the driver control to a frame based on its element
	 * @param element
	 * @param valueAttribute
	 */
	public void switchToFrame(WebDriver driver, WebElement frameelement) {
		driver.switchTo().frame(frameelement);
	}
	
	
	/**
	 * This utility method will access the application
	 * @param driver
	 * @param url
	 */
	public void navigateToUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public  void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public String captureScreenshot(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\image"+screenshotname+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();        //for Listeners
	}


}
























