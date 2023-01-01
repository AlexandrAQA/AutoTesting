package aqa.pageObjectPattern;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginWithValidCreds(){
       loginPage.openPage();
       loginPage.login("standard_user","secret_sauce");
        assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed(),
                "User was not logged in");

    }

    @Test
    public void validPasswordIsRequiredForLogin(){
        loginPage.openPage();
        loginPage.login("standard_user"," ");
        assertEquals(loginPage.getERROR(),
                "Epic sadface: Username and password do not match any user in this service",
                "THE Error message is incorrect");


    }
}
