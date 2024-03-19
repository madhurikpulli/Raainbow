package Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void Tc1() {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
}
}
