package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Organizations']")
	private WebElement organizationMenu;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement ContactsMenu;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement AccountsIcon;

	@FindBy(xpath= "//a[text()='Sign Out']")
	private WebElement signoutOption;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);


	}

	public WebElement getOrganizationMenu() {
		return organizationMenu;
	}


	public WebElement getContactsMenu() {
		return ContactsMenu;
	}

	/**
	 * This is a business library to click on Contacts Menu
	 */
	public WebElement getAccountsIcon() {
		return AccountsIcon;
	}

	/**
	 * This is a business library to click on Signout option
	 * @return
	 */
	public WebElement getSignoutOption() {
		return signoutOption;
	}

	public void clickOnOrganizationMenu() {
		getOrganizationMenu().click();
	}

	/**
	 * This is a business library to click on Contacts Menu
	 */
	public void clickOnContactsMenu() {
		getContactsMenu().click();
	}

	public void clickOnAccountsMenu() {
		getAccountsIcon().click();
	}

	/***
	 * This a Business library to perform signout operation in the application
	 * @param driver
	 * @throws InterruptedException 
	 */

	public void Signoutoption(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getAccountsIcon()).perform();
		Thread.sleep(1000);
		getSignoutOption().click();
	}

}
