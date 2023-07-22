package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

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
		driver.findElement(By.linkText("Create Lead")).click();
		
		//create Lead button
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Giant Tree");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("James");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Adam");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shravanvidya850@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9790089781");
		
		driver.findElement(By.name("submitButton")).click();
		
		//edit
		
driver.findElement(By.linkText("Edit")).click();

// change
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TreeMark");
	
		driver.findElement(By.name("submitButton")).click();

		
		
	
		
		
	}	
		
	}



	

