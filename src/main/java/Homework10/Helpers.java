package Homework10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helpers {
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikiv\\OneDrive\\Работен плот\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
    public static String url = "https://demoqa.com/";

}
