package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationsPage;
import genericUtility.BaseClass;

public class TC_002Test extends BaseClass {
	

	@Test(groups = "Regression")
	public void CON_001() throws Exception{
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganizationMenu();

		OrganizationsPage cp= new OrganizationsPage(driver);
		cp.clickOnCreateOrganizationIcon();
		
		int randNumber = jutil.getRandomNumber();
		String OrgName=eUtil.getDataFromExcel("Organization",5,1);
		String website=eUtil.getDataFromExcel("Organization",5,2);
		String employees=eUtil.getDataFromExcel("Organization",5,3);
		CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
		cop.createNewOrganization(OrgName+randNumber, website, employees);
	}

}

