package aqa.pageObjectPattern;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{

    @Test
    public void productsShouldBeAddedToCart() {
        loginPage.openPage();
        loginPage.loginAsValidUser();
        productsPage.openPage();
        productsPage.addToCart("Sauce Labs Backpack");

    }
}
