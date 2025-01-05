package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement OrganizationName;
	
	@FindBy(xpath = "//input[@size='27']")
	private WebElement Website;
	
	@FindBy(xpath = "//input[@name='employees']")
	private WebElement Employees;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement Phone;
	
	@FindBy(xpath = "//input[@name='otherphone']")
	private WebElement OtherPhone;
	
	@FindBy(xpath = "//input[@name='email1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement Billingaddress;
	
	@FindBy(xpath = "//input[@id='bill_city']")
	private WebElement BillingCity;
	
	@FindBy(xpath = "//input[@id='bill_state']")
	private WebElement BillingState;
	
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement SaveButton;
	
	
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrganizationName() {
		return OrganizationName;
	}


	public WebElement getWebsite() {
		return Website;
	}


	public WebElement getEmployees() {
		return Employees;
	}


	public WebElement getPhone() {
		return Phone;
	}


	public WebElement getOtherPhone() {
		return OtherPhone;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getBillingaddress() {
		return Billingaddress;
	}


	public WebElement getBillingCity() {
		return BillingCity;
	}


	public WebElement getBillingState() {
		return BillingState;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public void createNewOrganization(String orgName, String website, String employees) {
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getSaveButton().click();
	}
	
	public void createNewOrganization(String orgName, String website, String employees, String phone, String OtherPhone, String email) {
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(OtherPhone);
		getEmail().sendKeys(email);
		getSaveButton().click();
	}
	
	public void createNewOrganization(String orgName, String website, String billingAddress, String billingCity, String billingState) {
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getBillingaddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
}
	
	public void createNewOrganization(String orgName, String website, String employees, String phone, String OtherPhone, String email, String billingAddress, String billingCity, String billingState) {
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(OtherPhone);
		getEmployees().sendKeys(email);
		getBillingaddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	