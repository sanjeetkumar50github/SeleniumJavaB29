package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.BaseTest1;
import generic.Excel;

public class Test3 extends BaseTest1{
	@Test
	public void testA() {
		String u=getValue("URL");
		Reporter.log(u,true);
		
		String title=driver.getTitle();
		Reporter.log(title,true);
		
		String v=Excel.getData("./data/book1.xlsx","sheet1", 0, 0);
		Reporter.log(v,true);
	}

}
