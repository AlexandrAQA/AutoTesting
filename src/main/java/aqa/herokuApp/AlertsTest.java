package aqa.herokuApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertsTest extends BaseTest{

    @Test
    public void alertsTest(){
        //1.find link 'JavaScript Alerts'
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        //find button with text 'Click for JS Alert' then click
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //switch to Alert on the site and accept ALERT
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //save appeared text to the variable
        String result = driver.findElement(By.id("result")).getText();
        //validate TEXT
        assertEquals(result,"You successfully clicked an alert");


        //2.find the second button and click
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        //switch to Alert on the site and Dismiss alert
        alert = driver.switchTo().alert();
        alert.dismiss();
        //save appeared text to the variable
        result = driver.findElement(By.id("result")).getText();
        //validate TEXT
        assertEquals(result, "You clicked: Cancel");


        //3. The same steps as 2 previous parts but with printing Text
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"))
                .click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Text");
        alert.accept();
        result = driver.findElement(By.id("result")).getText();
        assertEquals(result, "You entered: Text");

    }
}
