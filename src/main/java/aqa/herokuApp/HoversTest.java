package aqa.herokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.List;
import static java.awt.SystemColor.text;
import static org.testng.Assert.assertEquals;


public class HoversTest extends BaseTest{

    @Test
    public void hoversTest(){
        //click on Hovers
        driver.findElement(By.linkText("Hovers")).click();
        //find all Avatar elements
        List<WebElement> avatars = driver.findElements
                (By.cssSelector("img[alt=\"User Avatar\"]"));

        //Creating action
        Actions actions = new Actions(driver);

        //action hover cursor to the avatar
        actions.moveToElement(avatars.get(0)).build().perform();
        //just for see text
        String h5 = driver.findElement(By.xpath("//div/h5")).getText();

        //validate text on our 1st Avatar
        assertEquals(h5,"name: user1","Assert message" );

        driver.findElement(By.linkText("View profile")).click();
        driver.navigate().back();

    }
}
