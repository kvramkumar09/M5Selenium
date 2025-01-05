package Frameworkpracflipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement ele= driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("Dell Laptop");
		driver.navigate().refresh();
		WebElement ele2= driver.findElement(By.xpath("//input[@name='q']"));
		ele2.sendKeys("Dell Laptop");
		
	
	}

}
