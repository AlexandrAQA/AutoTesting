package aqa.bShareLane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {

    private String name;
    /*
     Steps to validate:
    1. open browser
    2. go to the site https://www.sharelane.com/cgi-bin/register.py
    3. Enter zip code (5 integers, e.g. 12345)
    4. Click to 'Continue' button
     */

    @Test
    public void zipCodeValidator() {
        //system property for web driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //initiate Chrome web driver
        WebDriver webDriver = new ChromeDriver();

        //go to the site
        webDriver.get("https://www.sharelane.com/cgi-bin/register.py");

        //Creating element for locator
        WebElement zip_code_field = webDriver.findElement(By.name("zip_code"));
        //enter zip code into the zipCode field
        zip_code_field.sendKeys("12345");
        //find 'Continue' button by cssSelector and click
        webDriver.findElement(By.cssSelector("input[value='Continue']")).click();

        //create var with register button (find by cssSel)
        WebElement regButton = webDriver.findElement
                (By.cssSelector("input[value='Register']"));
        //Validate displaying "register" button
        Assert.assertTrue(regButton.isDisplayed(),
                "Sign Up form is not displayed or issue with redirection");
    }


}



