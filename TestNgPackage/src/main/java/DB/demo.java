package DB;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class demo {
	
	/*Exiting with a code of zero means a normal exit: System. exit(0); 
	 * We can pass any integer as an argument to the method. A non-zero 
	 * status code is considered as an abnormal exit.
	 * */
	
	
	FileInputStream f;
	XSSFWorkbook book;
	XSSFSheet sheet;
	Object [][] o;
	
	@Test(dataProvider ="d")
	public void test5(Object o, Object o1) {
		System.out.println(o);
		System.out.println(o1);
	
	
	@DataProvider (name="d")
	public Object [] [] readData() throws Throwable {
		try {
        f=new FileInputStream(new File("D:\\Selenium 2020\\TestNgPackage\\data.xlsx"));
        Book=new XSSFWorkbook(f);
        sheet=book.getSheetAt(0);
        sheet.getRow(2).getCell(1);
        o=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i=0;i<sheet.getLastRowNum();i++) {
        	for(int j=1;j<sheet.getLastRowNum();j++) {
        		XSSFCell cell=sheet.getRow(i).getCell(j);
        		switch(cell.getCellType()) {
        		case XSSFCell.CELL_TYPE_NUMERIC:{
        			o[i-1][j]=cell.getNumericCellValue();
        		}case XSSFCell.CELL_TYPE_STRING:{
        			System.out.println(cell.getStringCellValue());
        			o[i-1][j]=cell.getRichStringCellValue();
        		}
        		}
        	}
        }
		}
	}
}


        	return o;
        	

}
        
	
	
		
		
		
//		public static void main(String[] args)
//	    {
//	        //Blank workbook
//	        XSSFWorkbook workbook = new XSSFWorkbook();
//	         
//	        //Create a blank sheet
//	        XSSFSheet sheet = workbook.createSheet("Employee Data");
//	          
//	        //This data needs to be written (Object[])
//	        Map<String, Object[]> data = new TreeMap<String, Object[]>();
//	        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
//	        data.put("2", new Object[] {1, "Amit", "Shukla"});
//	        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
//	        data.put("4", new Object[] {3, "John", "Adwards"});
//	        data.put("5", new Object[] {4, "Brian", "Schultz"});
//	          
//	        //Iterate over data and write to sheet
//	        Set<String> keyset = data.keySet();
//	        int rownum = 0;
//	        for (String key : keyset)
//	        {
//	            Row row = sheet.createRow(rownum++);
//	            Object [] objArr = data.get(key);
//	            int cellnum = 0;
//	            for (Object obj : objArr)
//	            {
//	               Cell cell = row.createCell(cellnum++);
//	               if(obj instanceof String)
//	                    cell.setCellValue((String)obj);
//	                else if(obj instanceof Integer)
//	                    cell.setCellValue((Integer)obj);
//	            }
//	        }
//	        try
//	        {
//	            //Write the workbook in file system
//	            FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
//	            workbook.write(out);
//	            out.close();
//	            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
//	        }
//	        catch (Exception e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//}
//	
//	
//
//public static void main(String[] args)
//{
//    try
//    {
//        FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));
//
//        //Create Workbook instance holding reference to .xlsx file
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//
//        //Get first/desired sheet from the workbook
//        XSSFSheet sheet = workbook.getSheetAt(0);
//
//        //Iterate through each rows one by one
//        Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.iterator();
//        while (rowIterator.hasNext())
//        {
//            Row row = rowIterator.next();
//            //For each row, iterate through all the columns
//            Iterator<Cell> cellIterator = ((org.apache.poi.ss.usermodel.Row) row).cellIterator();
//             
//            while (cellIterator.hasNext())
//            {
//                Cell cell = cellIterator.next();
//                //Check the cell type and format accordingly
//                switch (cell.getCellType())
//                {
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.print(((org.apache.poi.ss.usermodel.Cell) cell).getNumericCellValue() + "t");
//                        break;
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.print(((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue() + "t");
//                        break;
//                }
//            }
//            System.out.println("");
//        }
//        file.close();
//    }
//    catch (Exception e)
//    {
//        e.printStackTrace();
//    }
//}
//}

//      }
//	}
   








