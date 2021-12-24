package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 Testcase: 3
Create Lead in Leaftaps Application        
==================================================
         1. Launch URL "http://leaftaps.com/opentaps/control/login"	 
	 2. Enter UserName and Password 	  
	 3. Click on Login Button 
	 4. Click on CRM/SFA Link	
	 5. Click on Leads Button	 
	 6. Click on create Lead Button	  
	 7. Enter all the fields in CreateLead page
          **Note
               1. Donot work on Parent Account Field
               2.Enter the Birthdate using SendKeys
	 8. Enter all the fields in contact information   
	 9. Enter all the fields in primary address	 
	 10. Get the Firstname and print it	  
	 11. Click on create Lead Button	 
	 12. Get and Verify the Title of the resulting Page(View Lead)
 */

public class Loginpage3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muruganandam");
		
		WebElement element1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select1=new Select(element1);
		select1.selectByVisibleText("Employee");
		
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select2=new Select(element2);
		select2.selectByVisibleText("Affiliate Sites");
		
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kiki");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("lala");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/01/22");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Biodata");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4000");
		
		WebElement element3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select3=new Select(element3);
		select3.selectByVisibleText("Health Care");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		
		WebElement element4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select4=new Select(element4);
		select4.selectByVisibleText("Corporation");
		
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("9999");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("1234");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Application form");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("none");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("8747240240");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Kiran");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Kiran");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Muruganandam");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Indra nagar");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("West car street");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Erode");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("638001");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("638001");
	    
	    
	    
	    WebElement element5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select5=new Select(element5);
		select5.selectByVisibleText("Tennessee");
		
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		System.out.println("Your Application has been filledout Successfully");
		
	driver.close();
		
		
		
		

	}

}
