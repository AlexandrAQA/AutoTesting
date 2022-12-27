package aqa.herokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Inputs extends BaseTest{

    @Test
    public void TestInputs(){
        driver.findElement(By.linkText("Inputs")).click();
        WebElement input = driver.findElement(By.tagName("input"));

        //void sendKeys  (CharSequence... keysToSend);

        //public enum Keys implements CharSequence {
        //    NULL('\ue000'),
        //    CANCEL('\ue001'),
        //    HELP('\ue002'),
        //    BACK_SPACE('\ue003'),
        //    TAB('\ue004'),
        // Keys is a keyboard's button
        input.sendKeys(Keys.ARROW_UP);

        driver.navigate().back();
    }
}
