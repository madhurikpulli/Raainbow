package Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class NotepadFetching {
public static void main(String[] args) throws Throwable {
	FileInputStream fisp=new FileInputStream("C:\\for_selenium\\Advanced_Selenium\\Project_project\\credentials.properties");
	Properties p=new Properties();
	p.load(fisp);
	String UN=p.getProperty("un");
	System.out.println(UN);
	
	
	
	
	
}
}
