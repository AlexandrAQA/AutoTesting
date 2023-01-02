package aqa.pageObjectPattern.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class ProductsTest extends BaseTest{

    @Test
    public void productsShouldBeAddedToCart() {
        loginPage.openPage();
        loginPage.loginAsValidUser();
        //productsPage.openPage();
        String product1 = "Sauce Labs Backpack";
        String product2 = "Sauce Labs Bolt T-Shirt";
        productsPage.addToCart(product1);
        productsPage.addToCart(product2);
        headerPage.openCart();
        List<WebElement> allProductsInCartBeforeRemove = cartPage.getAllProductsInCart();

        cartPage.removeProductFromCart(product2);
        List<WebElement> allProductsInCart_AfterRemove = cartPage.getAllProductsInCart();

        //validations:
        Assert.assertEquals(allProductsInCart_AfterRemove.size(),1,
                "Only 1 product should be in the cart after removing");
        Assert.assertEquals(allProductsInCart_AfterRemove.get(0).getText(),product1,
                "\"Sauce Labs Backpack\" product should be in the cart after removing");
        System.out.println("test is passed");
    }
}
