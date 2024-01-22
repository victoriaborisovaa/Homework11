package Homework10;

import org.junit.Test;

public class Tests extends BeforeAfter {
        LoginPage loginPage;

        @Test
    public void testLogin() {
            loginPage = new LoginPage(driver);
            loginPage.enterUsername("user1");
            loginPage.enterPassword("pass");
            loginPage.clickOnButton();

        }

    }

