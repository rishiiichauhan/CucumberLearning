package javamethod;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pageobjects.PracticeFormOR;

public class StudentRegistration {
	
	public static String filepath = "TestData/userimage.jpg";

	public static void launchBrowser(WebDriver driver, String url) throws InterruptedException {

		try {
			driver.get(url);
		} catch (TimeoutException e) {
			// TODO: handle exception
		}

	}

	public static void enterFirstName(WebDriver driver, String fname) {

		try {
			driver.findElement(PracticeFormOR.FIRSTNAME).sendKeys(fname);
	 

		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}

	public static void enterLasttName(WebDriver driver, String lname) {

		try {
			 
			driver.findElement(PracticeFormOR.LASTTNAME).sendKeys(lname);

		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}

	public static void enterEmail(WebDriver driver, String email) {

		try {
			driver.findElement(PracticeFormOR.EMAIL).sendKeys(email);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}

	public static void enterAddress(WebDriver driver, String address) {
		try {
			driver.findElement(PracticeFormOR.CURRENTADDRESS).sendKeys(address);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	 
	}

	public static void selectHobbies(WebDriver driver) {
		try {
			System.out.println("Hobbies are selected");
			WebElement element = driver.findElement(PracticeFormOR.HOBBIES);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} catch (TimeoutException e) {
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
	public static void selectGender(WebDriver driver) {
		 
		WebElement element = driver.findElement(PracticeFormOR.GENDER_MALE);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
	}
		 
		public static void enterPhoneNumber(WebDriver driver, String Phone) {
			

			try {
				 
				driver.findElement(PracticeFormOR.PHONE).sendKeys(Phone);

			} catch (NoSuchElementException e) {
				// TODO: handle exception
			} catch (TimeoutException e) {
				// TODO: handle exception
			}
		}

		
		public static void selectDate(WebDriver driver) {
			try {
				WebElement element = driver.findElement(PracticeFormOR.DATEPICKER);
				Actions actions = new Actions(driver);
				actions.moveToElement(element).click().build().perform();

				Select month = new Select(driver.findElement(PracticeFormOR.DATE_MONTH));
				month.selectByIndex(0);

				Select year = new Select(driver.findElement(PracticeFormOR.DATE_YEAR));
				year.selectByValue("2023");

				List<WebElement> day = driver.findElements(PracticeFormOR.DATE);

				for (WebElement myday : day) {
					System.out.println(myday);
					myday.click();
					break;
				}

			} catch (NoSuchElementException e) {
				System.out.println("Unable to locate element" + e);
			} catch (TimeoutException e) {
				e.printStackTrace();

			}
		}
		public static void selectState(WebDriver driver, String state) {
			try {

				WebElement element = driver.findElement(PracticeFormOR.STATE);
				Actions actions = new Actions(driver);
				actions.moveToElement(element).click().build().perform();

				WebElement se = driver.findElement(PracticeFormOR.STATE_VALUE);
				se.click();
				System.out.println("Entered state as " + state);
			} catch (NoSuchElementException e) {
				System.out.println("Unable to locate element" + e);
			} catch (TimeoutException e) {
				e.printStackTrace();

			}
		}
		public static void selectcity(WebDriver driver, String city) {
			try {
				driver.findElement(PracticeFormOR.CITY).click();
				WebElement se = driver.findElement(PracticeFormOR.CITY_VALUE);
				se.click();
				System.out.println("Entered city as" + city);
			} catch (NoSuchElementException e) {
				System.out.println("Unable to locate element" + e);
			} catch (TimeoutException e) {
				e.printStackTrace();

			}
		}
		public static void Submit(WebDriver driver) throws InterruptedException {
			try {
				WebElement element = driver.findElement(PracticeFormOR.SUBMIT);
				Actions actions = new Actions(driver);
				Thread.sleep(1000);
				actions.moveToElement(element).click().build().perform();

			} catch (NoSuchElementException e) {
				System.out.println("Unable to locate Submit button on the Practice form" + e);
			} catch (TimeoutException e) {
				e.printStackTrace();

			}
		}
	

public static void enterSubject(WebDriver driver, String subject) {
	

	try {
		 
		driver.findElement(PracticeFormOR.SUBJECT).sendKeys(subject);

	} catch (NoSuchElementException e) {
		// TODO: handle exception
	} catch (TimeoutException e) {
		// TODO: handle exception
	}
}



public static void uploadImage(WebDriver driver) {
    try {
        WebElement uploadImg = driver.findElement(PracticeFormOR.UPLOAD_IMAGE);
        uploadImg.sendKeys(new java.io.File(filepath).getAbsolutePath());
        Thread.sleep(3000);
    } catch (NoSuchElementException e) {
        System.out.println("Unable to locate element: " + e.getMessage());
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt(); // Restore interrupted status
        e.printStackTrace();
    }
}

	
}



