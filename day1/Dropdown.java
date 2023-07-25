package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//lead button
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Giant Tree");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("James");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Adam");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shravanvidya850@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9790089781");

		
		
		//to handle dropdown
		
		WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd=new Select(source);
		dd.selectByIndex(3);
		
		
		
	}

}
