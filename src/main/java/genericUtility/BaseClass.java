package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sDriver;
	public PropertiesUtility pUtil=new PropertiesUtility();
	public Seleniumutility sUtil=new Seleniumutility();
	public ExcelUtility eUtil=new ExcelUtility();
	public JavaUtility jutil= new JavaUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void dbCoonectivity() {
		System.out.println("Data Base connection started");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional ("chrome") String BROWSER) throws Exception {
		
		if (BROWSER.equals("chrome")) {
			driver= new ChromeDriver();
		}
		
		else if (BROWSER.equals("edge")) {
			driver= new EdgeDriver();
		}
		
		else if (BROWSER.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		
		sDriver=driver;
		String URL= pUtil.getDataFromPropertiesFile("url");
		sUtil.navigateToUrl(driver, URL);
		sUtil.implicitWait(driver, 15);
		sUtil.maximizeWindow(driver);
		System.out.println("Browser Launched Successfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() throws Exception {
		String UN= pUtil.getDataFromPropertiesFile("username");
		String PWD= pUtil.getDataFromPropertiesFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login DOne Successfully");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void LogoutOperation() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.Signoutoption(driver);
		System.out.println("Logout Done Successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser closed Successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDBConnection() {
		System.out.println("DB COnnection closed");
	}
		

}
