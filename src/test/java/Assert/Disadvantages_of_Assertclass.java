package Assert;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disadvantages_of_Assertclass {
@Test
public void Tc1() {
	Reporter.log("I am verification1",true);
    Assert.fail();
	Reporter.log("I am verification2",true);
}
@Test
public void Tc2() {
	Reporter.log("I am verification3",true);
}
}
