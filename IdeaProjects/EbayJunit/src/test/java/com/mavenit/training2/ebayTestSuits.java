/*package com.mavenit.training2;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;

public class ebayTestSuits extends Locators{

    @Test
    public void searchTest () {
        doSearch("Mobile Phones");
    }
    @Test
    public void basketTest () {
        doSearch("Vegetables");
        String selectedProduct = selectAnyProduct();
        addToTrolley();
        goToTrolley();
        List<String> trolleyItems = getProductsInTrolley();
        assertThat(trolleyItems, hasItem(selectedProduct));
    }
    @Test
    public void trolleyQuantityTest () {
        doSearch("shoes");
        String selectedProduct = selectAnyProduct();
        applySizeAndColor();
        addToTrolley();
        goToTrolley();
        double priceForOneQuantity = getPriceFromBasket();
        double expected = priceForOneQuantity * 2;

        new Select(driver.findElement(By.cssSelector(".listbox__control"))).selectByVisibleText("2");
        sleep(5000);
        double actual = getPriceFromBasket();
        assertThat(actual, is(equalTo(expected)));
    }

}*/
