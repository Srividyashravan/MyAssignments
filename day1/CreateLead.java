package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Giant Tree");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harry");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kark");
		
WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select emp=new Select(source);
emp.selectByVisibleText("Employee");


WebElement market=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select markcamp=new Select(market);
markcamp.selectByValue("9001");


WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select own=new Select(ownership);
own.selectByIndex(5);


WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select cou=new Select(country);
cou.selectByVisibleText("India");


driver.findElement(By.name("submitButton")).click();

String title = driver.getTitle();
System.out.println("Title of the page is"+ title);





		
		
	}

}
