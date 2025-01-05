package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleSameclassDataProvider {
	
	@Test(dataProvider = "getcredentials", dataProviderClass = DataProviderClass.class)
	
	public void dataProviderPrac (String UN, String PWD) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN, Keys.TAB, PWD, Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="getdata")
	public Object[][] getData(){
		return new Object[][] {
			{"admin", "admin"},
			{"username456@gmail.com", "username456"}
		};
		
	}

}
