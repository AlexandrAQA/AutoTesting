package aqa.herokuApp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTest extends BaseTest {

    @Test
    public void iframeTest() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.id("tinymce")).
                findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(text, "Your content goes here.");
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("button[title='Align center'")).click();
        driver.navigate().back();

    }

    @Test
    public void iframeTest2() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.id("tinymce")).
                findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(text, "Your content goes here.");
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("button[title='Align center'")).click();
//        driver.navigate().back();

    }

    @Test
    public void iframeTest3() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.id("tinymce")).
                findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(text, "Your content goes here.");
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("button[title='Align center'")).click();
        //driver.navigate().back();
    }
}