package aqa.herokuApp.addElementTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AddElement extends BaseTests {

    @Test
    public void addElement() {
        element = driver.findElement(By.xpath("//button[text()='Add Element']"));
        element.click();
        element.click();
        elementDel = driver.findElement(By.xpath("//button[text()='Delete']"));
        elementDel.click();

        assertTrue(element.isDisplayed());

        WebElement addedDelElement = driver.findElement(By.className("added-manually"));
        assertTrue(addedDelElement.isDisplayed());//




    }
}
