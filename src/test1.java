

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
 
public class test1 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox D:\\Program Files\\Mozilla Firefox\\firefox.exe", "http://www.baidu.com/");
		selenium.start();
	}

	@Test
	public void testUntitled2 () throws Exception {
		selenium.open("/");
		selenium.windowMaximize();
		selenium.type("id=kw", "cd");
		selenium.click("id=su");
	     
	}

	@After
	public void tearDown() throws Exception {
		//selenium.stop();
	}
}
