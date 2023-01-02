package aqa.pageObjectPattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage{

    private final By CART_LINK = By.xpath("//div[@id='shopping_cart_container']/a");

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public void openCart(){
        driver.findElement(CART_LINK).click();

    }
}
