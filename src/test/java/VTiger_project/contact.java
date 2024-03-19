package VTiger_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contact {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[4]")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("kothuri");
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
	Thread.sleep(5000);
	Actions a=new Actions(driver);
	WebElement admimg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	a.moveToElement(admimg).perform();
	
	driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
	
}
}
