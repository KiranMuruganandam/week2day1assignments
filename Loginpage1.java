package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*Test case 1:

Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Create Contact
Type First Name
Type Last Name
Click Create Contact Button
Print the first name and browser title 
Close the browser*/

public class Loginpage1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kiran");
		driver.findElement(By.id("lastNameField")).sendKeys("Muruganandam");
		driver.findElement(By.name("submitButton")).click();
		String string1= driver.findElement(By.id("viewContact_firstName_sp")).getText();
		String string2 = driver.getTitle();
		System.out.println(string1);
		System.out.println(string2);
		
		driver.close();
		
		
		
		

	}

}
