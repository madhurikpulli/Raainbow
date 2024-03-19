package VTiger_project;

import java.sql.Driver;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class First_class {

	public static void main(String[] args) throws Throwable {
		Random ran = new Random();
		int r = ran.nextInt(100);
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		 driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[3]")).click();
		 driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("MAGNEQ SOFTWARE"+r);
		 driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
	     Thread.sleep(5000);
		Actions a=new Actions(driver);
		WebElement admimg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		a.moveToElement(admimg).perform();
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
	
	
	}
}


