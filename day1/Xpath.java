package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");	
		
		//input[@value='Login']
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		

	}

}
