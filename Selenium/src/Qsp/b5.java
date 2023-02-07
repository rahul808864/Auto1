package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com"); 
		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8088647766");
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//button[text()='Verify']")).click();
//		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi mobiles");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@type='button']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[.='REDMI 9i Sport (Coral Green, 64 GB)']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@type='button']")).click();
       Thread.sleep(2000);
	}

}
