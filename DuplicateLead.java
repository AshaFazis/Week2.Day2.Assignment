package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main"); //Launch URL "http://leaftaps.com/opentaps/control/login"
		WebElement userNameElement = driver.findElement(By.id("username")); //Enter UserName Using Id Locator
		userNameElement.sendKeys("Demosalesmanager");
		WebElement passwordElement = driver.findElement(By.id("password")); //Enter Password Using Id Locator
		passwordElement.sendKeys("crmsfa");
		WebElement loginButtonElement = driver.findElement(By.className("decorativeSubmit")); //Click on Login Button using Class Locator
		loginButtonElement.click();
		WebElement crmLinkElement = driver.findElement(By.linkText("CRM/SFA")); //Click on CRM/SFA Link
		crmLinkElement.click();
		WebElement leadsButtonElement = driver.findElement(By.linkText("Leads")); //Click on Leads Button
		leadsButtonElement.click();
		WebElement createLeadElement = driver.findElement(By.linkText("Create Lead")); //Click on Create Lead 
		createLeadElement.click();
		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName")); //Enter CompanyName Field Using id Locator
		companyNameElement.sendKeys("TCS");
		WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName")); //Enter FirstName Field Using id Locator
		firstNameElement.sendKeys("Asha");
		WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName")); //Enter LastName Field Using id Locator
		lastNameElement.sendKeys("Fazis");
		WebElement localFirstNameElement = driver.findElement(By.id("createLeadForm_firstNameLocal")); //Enter FirstName(Local) Field Using id Locator
		localFirstNameElement.sendKeys("Asha");
		WebElement deptNameElement = driver.findElement(By.name("departmentName")); // Enter Department Field Using any Locator of Your Choice
		deptNameElement.sendKeys("IT");
		WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));//Enter Description Field Using any Locator of your choice 
		descriptionElement.sendKeys("A good day to learn selenium");
		WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail")); //Enter your email in the E-mail address Field using the locator of your choice
		emailElement.sendKeys("asha@gmail.com");
		WebElement stateDropdownElement = driver.findElement(By.name("generalStateProvinceGeoId")); //Select State/Province as NewYork Using Visible Text
		Select driver1 = new Select(stateDropdownElement);
		driver1.selectByVisibleText("New York");
		WebElement createButtonElement = driver.findElement(By.className("smallSubmit")); //Click on Create Button
		createButtonElement.click();
	    String title = driver.getTitle(); //Get the Title of Resulting Page(refer the video)  using driver.getTitle()
	    System.out.println(title);
	    WebElement duplicateLeadButtonElement = driver.findElement(By.linkText("Duplicate Lead")); //Click on Duplicate button
	    duplicateLeadButtonElement.click();
	    WebElement clearCompanyNameElement = driver.findElement(By.id("createLeadForm_companyName")); //Clear the CompanyName Field using .clear() And Enter new CompanyName
	    clearCompanyNameElement.clear();
	    WebElement newCompanyNameElement = driver.findElement(By.id("createLeadForm_companyName")); 
	    newCompanyNameElement.sendKeys("Testleaf");
	    WebElement clearFirstNameElement  = driver.findElement(By.id("createLeadForm_firstName")); //Clear the FirstName Field using .clear() And Enter new FirstName
	    clearFirstNameElement.clear();
	    WebElement newFirstNameElement = driver.findElement(By.id("createLeadForm_firstName")); 
	    newFirstNameElement.sendKeys("Fazis");
	    WebElement createElement = driver.findElement(By.xpath("//input[@type='submit']")); //Click on Create Lead Button
	    createElement.click();
	    System.out.println(driver.getTitle()); //Get the Title of Resulting Page(refer the video)  using driver.getTitle()
	    
	}

}
