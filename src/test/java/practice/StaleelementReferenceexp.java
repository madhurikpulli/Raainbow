package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleelementReferenceexp {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//store emailID in reference variable
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	//refresh the page
	driver.navigate().refresh();
	email.sendKeys("abx@gamil.com");
	System.out.println("Boss iam from github");
}
}
