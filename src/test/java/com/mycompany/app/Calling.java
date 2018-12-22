package com.mycompany.app;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Calling {

	public class toGettingData extends BaseClass {

		@Test
		public void toReadDataFile() {
			System.out.println(p.getProperty("URL"));
			System.out.println(p.getProperty("BrowserName"));
			System.out.println(p.getProperty("Username"));
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// now copy the screenshot to desired location using copyFile
				// //method
				FileUtils.copyFile(src, new File("TakeSnapshot\\test.jpg"));
				System.out.println("fialed 2nd test case");
			}

			catch (IOException e) {
				System.out.println(e.getMessage());
		}
		
		/*@Test
		public void TakingScreenshotone() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile
			// //method
			FileUtils.copyFile(src, new File("TakeSnapshot\\test.jpg"));
			System.out.println("fialed 2nd test case");
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}*/

	}
	}

}
