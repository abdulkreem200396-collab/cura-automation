package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage extends BasePage {

    public AppointmentPage(WebDriver driver){
        super(driver);
    }

    By visitDate = By.id("txt_visit_date");
    By comment = By.id("txt_comment");
    By bookBtn = By.id("btn-book-appointment");

    public void book(String date,String text){

        type(visitDate,date);
        type(comment,text);
        click(bookBtn);
    }
}
