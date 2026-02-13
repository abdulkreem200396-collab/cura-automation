package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	 public void clickMakeAppointment(){

	        driver.findElement(By.id("btn-make-appointment")).click();
	    }

}
