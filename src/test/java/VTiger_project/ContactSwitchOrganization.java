package VTiger_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ContactSwitchOrganization {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[4]")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	Thread.sleep(3000);
	Thread.sleep(5000);
	Set<String> allwindows=driver.getWindowHandles();
    System.out.println(allwindows.size());
    Thread.sleep(5000);
    for(String child : allwindows) {
    	Thread.sleep(5000);
    	driver.switchTo().window(child);
    }
    	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys("Magneq Soft");
	WebElement adm=driver.findElement(By.xpath("//select[@name='search_field']"));
   Select select1=new Select(adm);
    select1.selectByIndex(0);
    Set<String> allwindows1=driver.getWindowHandles();
    System.out.println(allwindows1.size());
    Thread.sleep(5000);
    for(String parent : allwindows1) {
    	Thread.sleep(5000);
    	driver.switchTo().window(parent);
    	 Thread.sleep(5000);
 		Actions a=new Actions(driver);
 		WebElement admimg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
 		a.moveToElement(admimg).perform();
 		
 		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
 	
 	

    

}
}
}

