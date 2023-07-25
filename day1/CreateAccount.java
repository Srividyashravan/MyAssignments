package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		//Click create button
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Account Name
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		
		//Description
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		//Localname
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("DLA");
		
		//Sitename
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Maple");
		
		//Annual Revenue
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("10,00,000");
		
		//Industry
WebElement Industry = driver.findElement(By.name("industryEnumId"));
Select ind=new Select(Industry);
ind.selectByIndex(3);
		
//ownership

WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
Select own=new Select(Ownership);
own.selectByVisibleText("S-Corporation");

//Source


WebElement Source = driver.findElement(By.id("dataSourceId"));
Select sou=new Select(Source);
sou.selectByValue("LEAD_EMPLOYEE");

//Marketing Camaign
WebElement Market = driver.findElement(By.id("marketingCampaignId"));
Select mar=new Select(Market);
mar.selectByIndex(6);


//state/province
WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
Select sta=new Select(State);
sta.selectByVisibleText("Texas");


//create account
//input[@class='smallSubmit']

driver.findElement(By.className("smallSubmit")).click();

	}

}
