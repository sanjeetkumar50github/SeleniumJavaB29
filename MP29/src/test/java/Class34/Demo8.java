package Class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo8 {

	public static void main(String[] args) throws Exception {
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		  Workbook wb=WorkbookFactory.create(new FileInputStream("./data/book2.xlsx"));
		  int cc=wb.getSheet("sheet2").getRow(0).getLastCellNum();
		  System.out.println(cc);
		  for(int i=0;i<cc;i++) {
			  String k=wb.getSheet("sheet2").getRow(0).getCell(i).toString();
			  String v=wb.getSheet("sheet2").getRow(2).getCell(i).toString();
			  map.put(k, v);  
		  }

		  wb.close();
		  System.out.println(map);
		  
		  System.out.println(map.get("NewPwd"));
	}

}