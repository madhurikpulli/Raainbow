package VTiger_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opportunity {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[5]")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Process Executive");
	WebElement org=driver.findElement(By.xpath("//select[@id='related_to_type']"));
	 Select select1=new Select(org);
	    select1.selectByIndex(0);
    driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();	
    Thread.sleep(5000);
	Set<String> allwindows=driver.getWindowHandles();
    System.out.println(allwindows.size());
    Thread.sleep(5000);
    for(String child : allwindows) {
    	Thread.sleep(5000);
    	driver.switchTo().window(child);
    }
    	Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MAGNEQ SOFTWARE");
    Set<String> allwindows1=driver.getWindowHandles();
    System.out.println(allwindows1.size());
    Thread.sleep(3000);
    for(String parent : allwindows1) {
    	Thread.sleep(3000);
    	driver.switchTo().window(parent);
    }
    Thread.sleep(5000);
    WebElement nam=driver.findElement(By.xpath("//select[@class='small']"));
    Thread.sleep(5000);
    Select select2=new Select(nam);
    Thread.sleep(5000);
    select1.selectByIndex(0);
    
    
    
    
}
}
