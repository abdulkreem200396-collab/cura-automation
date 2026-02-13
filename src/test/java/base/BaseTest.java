package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
public class BaseTest {
	protected WebDriver driver;

	@BeforeEach
	void setup() {

	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://katalon-demo-cura.herokuapp.com/");
	}

	@AfterEach
	void teardown() {

	    driver.quit();
	}

}
