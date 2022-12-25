package aqa.bShareLane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SignUpVersion2 extends BaseTest{

    @Test
    public void zipCodeShouldBevalid() {
        WebElement zip_code_field = driver.findElement(By.name("zip_code"));
        zip_code_field.sendKeys("67890");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement registerButton = driver.findElement(By.cssSelector("input[value='Register']"));
        assertTrue(registerButton.isDisplayed(),
                "Redirection issue");
    }

    @Test
    public void user_ShouldNotBe_SignedUp_WithEmptyZipCode() {
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        WebElement errorMessage = driver.findElement(By.className("error_message"));
        assertTrue(errorMessage.isDisplayed(), "Error message is not displayed in case of empty zip code");
        assertEquals(errorMessage.getText(), ZIP_CODE_ERROR, "Error message should be correct");
    }

    @Test
    public void userValidInfoSignUp() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=67890");
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Steven");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Autotesterov");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("teststeven@gmail.com");
        driver.findElement(By.cssSelector("input[name='password1']")).sendKeys("20234Steven");
        driver.findElement(By.cssSelector("input[name='password2']")).sendKeys("20234Steven");
        driver.findElement(By.cssSelector("input[value='Register")).click();
        assertTrue(driver.findElement(By.className("confirmation_message")).isDisplayed(),
                "The message\"Account is created\" is displayed");
    }

    @Test
    public void userInvalidInfo() {
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=67890");
        driver.findElement(By.cssSelector("input[value='Register")).click();
        WebElement errorMsg = driver.findElement(By.className("error_message"));
        assertTrue(errorMsg.isDisplayed(), "Error message is not displayed in case of " +
                "registration with empty user info");
        assertEquals(errorMsg.getText(), USER_INFO_ERROR, "Error message should be correct");

    }
}


