package aqa.herokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTest{

    @Test
    public void dropDownTest(){
        driver.findElement(By.linkText("Dropdown")).click();

        //select - good class for working with dropdowns
        //Select has nice methods
        Select dropDownSelect = new Select(driver.findElement(By.id("dropdown")));

        assertEquals(dropDownSelect.getOptions().get(0).getText(), "Please select an option");
        assertEquals(dropDownSelect.getOptions().get(1).getText(), "Option 1");
        assertEquals(dropDownSelect.getOptions().get(2).getText(), "Option 2");

        dropDownSelect.selectByVisibleText("Option 1");
        assertEquals(dropDownSelect.getFirstSelectedOption().getText(),"Option 1", "Option 1 should be selected");
        dropDownSelect.selectByVisibleText("Option 2");
        assertEquals(dropDownSelect.getFirstSelectedOption().getText(),"Option 2", "Option 2 should be selected");
        driver.navigate().back();
    }

}
