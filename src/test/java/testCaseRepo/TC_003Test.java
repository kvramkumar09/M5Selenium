package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationsPage;
import genericUtility.BaseClass;

public class TC_003Test extends BaseClass {
	
	@Test
	public void ORG_002() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganizationMenu();

		OrganizationsPage op= new OrganizationsPage(driver);
		op.clickOnCreateOrganizationIcon();
		
		int randNumber= jutil.getRandomNumber();
		
		String OrgName=eUtil.getDataFromExcel("Organization",5,1);
		String website=eUtil.getDataFromExcel("Organization",5,2);
		String employees=eUtil.getDataFromExcel("Organization",5,3);
		String phone=eUtil.getDataFromExcel("Organization",5,4);
		String otherphone=eUtil.getDataFromExcel("Organization",5,5);
		String email=eUtil.getDataFromExcel("Organization",5,6);
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.createNewOrganization(OrgName+randNumber, website, employees, phone, otherphone, email);
	}

}
