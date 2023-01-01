package aqa.bShareLane;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    public static final String ZIP_CODE_ERROR = "Oops, error on page. ZIP code should have 5 digits";
    public static final String USER_INFO_ERROR = "Oops, error on page." + " Some of your fields have invalid data or email was previously used";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }

}
