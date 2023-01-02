package aqa.pageObjectPattern.tests;

import aqa.pageObjectPattern.pages.CartPage;
import aqa.pageObjectPattern.pages.HeaderPage;
import aqa.pageObjectPattern.pages.LoginPage;
import aqa.pageObjectPattern.pages.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    HeaderPage headerPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        //Initialize web driver and create driver instance
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Set UP driver settings
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Create new Page
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        headerPage = new HeaderPage(driver);
        cartPage = new CartPage(driver);
    }

    //Quit driver
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
