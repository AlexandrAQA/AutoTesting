package aqa.pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    WebDriver driver;

   private final By TITLE = By.cssSelector(".title");

    public ProductsPage( WebDriver driver) {
        this.driver =  driver;
    }

    public WebElement getTitle(){
       return driver.findElement(TITLE);
   }
}