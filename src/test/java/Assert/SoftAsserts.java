package Assert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
@Test
public void sample1() {
	String s1="MADHU";
	String s2="MADHU";
	SoftAssert s=new SoftAssert();
	s.assertEquals(s1,s2);//verification 1
	System.out.println("Hii.. I am after failing the TC ");//verification 2
	s.assertAll();
	
	
}
}
