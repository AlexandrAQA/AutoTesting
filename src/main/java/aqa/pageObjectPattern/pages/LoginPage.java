package aqa.pageObjectPattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    @CacheLookup //searching 1 time then we get it from cache
    private WebElement userNameInput;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    @CacheLookup
    private WebElement loginButton;

    @FindBy(css = "h3[data-test=error]")
    private WebElement error;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,LoginPage.class);
    }

    public void openPage() {
        driver.get(BASE_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(30))
                .ignoring(NoSuchMethodException.class);
    }

    public void login(String user, String password) {
        userNameInput.sendKeys(user);
        passwordInput.sendKeys(password);
        loginButton.submit();
    }

    public void loginAsValidUser() {
        login("standard_user", "secret_sauce");
    }

    public String getError() {
        return error.getText();
    }
}
