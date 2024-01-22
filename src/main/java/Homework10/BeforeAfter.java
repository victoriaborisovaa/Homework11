package Homework10;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BeforeAfter {
    public WebDriver driver;

    @Before
    public void setUp() {

        driver = BrowserFactory.getBrowser("Chrome");
        driver.get("https://demoqa.com/");

    }
    @After
     public void tearDown() {

        if  (driver != null) {
            driver.quit();
        }
    }
}
