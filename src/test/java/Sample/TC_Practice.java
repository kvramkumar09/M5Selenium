package Sample;

import org.testng.annotations.Test;

import ObjectRepo.ContactPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_Practice extends BaseClass {
	
	@Test
	public void practice() throws Exception {
		
		
		String firstName=eUtil.getDataFromExcel("Contacts",2,1);
		String LastName=eUtil.getDataFromExcel("Contacts",2,2);
		String title=eUtil.getDataFromExcel("Contacts",2,3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnAccountsMenu();
		
		ContactPage cp = new ContactPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		CreatingNewContactPage cnp = new CreatingNewContactPage(driver);
		cnp.createNewContact(firstName, LastName, title);
		
	}

}
