package aqa.pageObjectPattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement userNameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(css = "h3[data-test=error]")
    private WebElement error;

//    private final By USER_NAME_INPUT = (By.id("user-name"));
//    private final By PASSWORD_INPUT = (By.id("password"));
//    private final By LOGIN_BUTTON = (By.id("login-button"));
//    private final By ERROR = (By.cssSelector("h3[data-test=error]"));

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,LoginPage.class);
    }

    public void openPage() {
        driver.get(BASE_URL);
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
