package Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parellel2 {
@Test
public void Tc2() {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
}
}
