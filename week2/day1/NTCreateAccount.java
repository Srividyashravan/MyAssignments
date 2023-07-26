package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		//Create Account button
		
		driver.findElement(By.linkText("Create Account")).click();
		
WebElement currency=driver.findElement(By.id("currencyUomId"));
Select prefcurr=new Select(currency);
prefcurr.selectByValue("INR");


driver.findElement(By.name("description")).sendKeys("NRI Account");
//input[@id='groupNameLocal']

driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("james");


//input[@id='officeSiteName']
driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Raintree");

//input[@id='annualRevenue']
driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("10,00,000");

WebElement industry=driver.findElement(By.name("industryEnumId"));
Select ind=new Select(industry);
ind.selectByIndex(4);


WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select emp=new Select(source);
emp.selectByVisibleText("Employee");


WebElement market=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select markcamp=new Select(market);
markcamp.selectByValue("9001");


WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select own=new Select(ownership);
own.selectByIndex(5);

WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
Select sta=new Select(State);
sta.selectByVisibleText("Texas");


//input[@class='smallSubmit']
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();





		
		
	}

}
