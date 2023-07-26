package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

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
		
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");	
				driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Credit Limited Account']")).click();
				
	
	
		String accountname=driver.findElement(By.xpath("(//a[text()='Create Account']")).getText();   
		System.out.println(accountname);
		String description=driver.findElement(By.xpath("//td[@class='tabletext']")).getText();
		System.out.println(description);
		String TitleName=driver.getTitle();
		System.out.println(TitleName);
		driver.close();
	}
	
	

}
