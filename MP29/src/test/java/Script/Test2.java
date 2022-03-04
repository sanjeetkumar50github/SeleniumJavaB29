package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.BaseTest1;

public class Test2 extends BaseTest1{
	@Test
	public void testA() {
		String title=driver.getTitle();
		Reporter.log(title,true);
	}

}
