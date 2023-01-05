package aqa.herokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JS_executor_test extends BaseTest{

    @Test
    public void jsExampleTest(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("a[href='/windows']"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight);", element);
        jsExecutor.executeScript("window.scrollBy(0,~document.body.scrollHeight);", element);
    }
}
