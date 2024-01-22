package Homework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BeforeAfter {
    WebDriver driver;

        By usernameLog = By.xpath("//*[@id='userName']");
        By passwordLog = By.xpath("//*[@id='password']");
        By loginButton = By.xpath("//*[@id='login']");

        private WebElement WebDriver;

    public LoginPage(WebDriver driver) {

    }


    public void LoginPage (WebDriver driver) {
            this.driver = driver;
        }
        public void enterUsername (String username) {
            driver.findElement(usernameLog).sendKeys(username);
        }

        public void enterPassword(String password){
            driver.findElement(passwordLog).sendKeys(password);
        }
        public void clickOnButton(){
            driver.findElement(loginButton).click();
        }







}
