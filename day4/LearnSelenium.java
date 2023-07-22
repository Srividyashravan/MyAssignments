package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	private static WebElement findElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();

	 driver.findElement(By.id("email")).sendKeys("vidyabala08@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("Subramaniansri");

	}

}
