package aqa.pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{

    private final By TITLE = By.cssSelector(".title");
    private String addToCartButton =
            "//div[text()='%s']/ancestor::div[@class='inventory_item']//button";


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL + "inventory.html");
    }

    public WebElement getTitle(){
       return driver.findElement(TITLE);
   }

   public void addToCart(String productName){
       By fullLocator = By.xpath(String.format(addToCartButton, productName));
       driver.findElement(fullLocator).click();
   }
}
