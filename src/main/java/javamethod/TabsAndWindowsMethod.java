package javamethod;

 
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import pageobjects.PracticeFormOR;
import pageobjects.TabAndWindowOR;
 
public class TabsAndWindowsMethod {
	
	public static void launchBrowser(WebDriver driver, String URL) {
	
	try {
		
		driver.get(URL);
	}
	catch (TimeoutException e) {
	} 
	}
	
	public static void NewTab(WebDriver driver1) throws InterruptedException {
	{
	}
		try {
			
				driver1.findElement(TabAndWindowOR.NEWTAB).click();
				ArrayList<String> tabs = new ArrayList<String>(driver1.getWindowHandles());
				
				driver1.switchTo().window(tabs.get(1));
				driver1.close();
				Thread.sleep(1000);
			}
			catch (NoSuchElementException e) {
			// TODO: handle exception
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}
	
		public static void newwindow() throws InterruptedException { {
	try {
		driver.findElement(TabAndWindowOR.NEWWINDOW).click();
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		
 

	} catch (NoSuchElementException e) {
		// TODO: handle exception
	} catch (TimeoutException e) {
		// TODO: handle exception
	}
}


}
}