package DB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExceptionHandling {

	// runtime exception
	// compiletime exception (compiler warn)
	// try -- catch and throw / throws clause

	//all exceptions
	//ArithmeticException
	//FileNotFoundException
	//IoException

	// public void demo() throws Exception {
	// throw new noSuchAlgorithmException();
	FileInputStream f1;
	XSSFWorkbook book;
	XSSFWorkbook f;
	XSSFSheet sheet;
	Object [] [] O;
	XSSFCell cell;



	@DataProvider (name="login1")
	public Object[] [] readData() {
		try {
			f1=new FileInputStream(new File("D:\\Selenium 2020\\TestNgPackage\\data.xlsx"));
			book=new XSSFWorkbook(f1);
			sheet=book.getSheetAt(0);

			String line=bf.readLine();
			while(line!=null) {
				System.out.println(line);
				line=bf.readLine();
			}
		}
	}

	FileInputStream f;
	
	/*Exiting with a code of zero means a normal exit: System. exit(0); 
	 * We can pass any integer as an argument to the method. A non-zero 
	 * status code is considered as an abnormal exit.
	 * */

	BufferedReader bf=new BufferedReader(f);
	{
		try {
			// risky code
			FileReader f=new FileReader(new File("D:\\Selenium 2020\\TestNgPackage\\Book.txt"));

			String line=bf.readLine();
			while(line!=null) {
				System.out.println(line);
				line=bf.readLine();
			}
			System.out.println(1/5);
		}catch (FileNotFoundException e) {
			// message
			System.out.println("file not found");
		}catch (ArithmeticException e) {
			// message
			System.out.println("divide not possible");
		}catch (Exception e) {
			// only exception will use at last
			System.out.println("file not found");
		}finally {
			try {
				if(f!=null)
				{
					f.close();	
				}
				if(bf!=null)
				{
					bf.close();	
				}

				System.out.println("continue");
			}


		}
	}
}
}
}
