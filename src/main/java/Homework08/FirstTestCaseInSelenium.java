package Homework08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCaseInSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikiv\\OneDrive\\Работен плот\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://demoqa.com/");
        System.out.println(d.getTitle());
        WebElement findElementById = d.findElement(By.id("dateAndTimePickerInput"));
        findElementById.click();
        d.quit();


}}

