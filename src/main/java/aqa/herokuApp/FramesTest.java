package aqa.herokuApp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest{

    @Test
    public void framesTest(){
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),
                "Your content goes here.",
                "The text is different");
    }
}
