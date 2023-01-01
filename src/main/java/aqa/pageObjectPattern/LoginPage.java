package aqa.pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class LoginPage {

    WebDriver driver;

    private final By userNameInput = (By.id("user-name"));
    private final By passwordInput = (By.id("password"));
    private final By loginButton = (By.id("login-button"));
    private final By error = (By.cssSelector("h3[data-test=error]"));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String user, String password) {

        driver.findElement(userNameInput).sendKeys(user);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).submit();
    }

    public String getError() {
        return driver.findElement(error).getText();
    }
}
