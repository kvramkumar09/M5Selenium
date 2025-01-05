package testCaseRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.ContactPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;


@Listeners (genericUtility.ListenersImplementation.class)
public class TC_001Test extends BaseClass {

	@Test(groups="smoke")
	public void CON_00() throws Exception{
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
//        Assert.fail();
		ContactPage cp= new ContactPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		String firstName=eUtil.getDataFromExcel("Contacts",2,1);
		String LastName=eUtil.getDataFromExcel("Contacts",2,2);
		String title=eUtil.getDataFromExcel("Contacts",2,3);
		CreatingNewContactPage cnp = new CreatingNewContactPage(driver);
		cnp.createNewContact(firstName, LastName, title);
	}

}
