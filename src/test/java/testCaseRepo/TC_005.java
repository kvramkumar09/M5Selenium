package testCaseRepo;

import ObjectRepo.CreateNewOrganizationPage;
import ObjectRepo.HomePage;
import ObjectRepo.OrganizationsPage;
import genericUtility.BaseClass;

public class TC_005 extends BaseClass {
	public void ORG_004() throws Exception {
	HomePage hp = new HomePage(driver);
	hp.clickOnOrganizationMenu();

	OrganizationsPage cp= new OrganizationsPage(driver);
	cp.clickOnCreateOrganizationIcon();
	
	int randNumber= jutil.getRandomNumber();
	
	String OrgName=eUtil.getDataFromExcel("Organizations",11,1);
	String website=eUtil.getDataFromExcel("Organizations",11,2);
	String employees=eUtil.getDataFromExcel("Organizations",11,3);
	String phone=eUtil.getDataFromExcel("Organizations",11,4);
	String otherphone=eUtil.getDataFromExcel("Organizations",11,5);
	String email=eUtil.getDataFromExcel("Organizations",11,6);
	String billingAddress=eUtil.getDataFromExcel("Organizations",11,7);
	String BillingCity=eUtil.getDataFromExcel("Organizations",11,8);
	String BillingState=eUtil.getDataFromExcel("Organizations",11,9);
	CreateNewOrganizationPage cop = new CreateNewOrganizationPage(driver);
	cop.createNewOrganization(OrgName+randNumber, website, employees, phone, otherphone, email, billingAddress, BillingCity, BillingState);
}

}

