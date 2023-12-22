package Homework09;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitTest {

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikiv\\OneDrive\\Работен плот\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        @Test
        public void testDemoQA() {

            driver.get("https://demoqa.com/");

            driver.findElement(By.id("dateAndTimePickerInput"));
            String actualTitle = driver.getTitle();
            String expectedTitle = "Date Picker";


        }
    }
    @After
    public void endTest() {
        driver.quit();
    }

}
