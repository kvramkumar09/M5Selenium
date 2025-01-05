package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	
	@FindBy(xpath= "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement title;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public void createNewContact(String fname, String lname, String title) {
		getFirstName().sendKeys(fname);
		getLastname().sendKeys(lname);
		getTitle().sendKeys(title);
		getSaveButton().click();
		
		}
}
