package com.mavenit.training2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Locators {

    public static WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        System.out.println("---------------------");
        driver.quit();
    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int randomnumber(int size) {
        System.out.println(size);
        Random random = new Random();
        return random.nextInt(size - 1);
    }

    public void doSearch(String Item) {
        WebElement searchbox = driver.findElement(By.cssSelector("input[placeholder='Search for anything']"));
        searchbox.sendKeys(Item);
        searchbox.sendKeys(Keys.ENTER);
        sleep(4000);
    }

    public String selectAnyProduct() {
        List<WebElement> products = driver.findElements(By.className("s-item__title"));
        int indexnumber = randomnumber(products.size());
        WebElement selectedelement = products.get(indexnumber);
        String expcted = selectedelement.getText();
        selectedelement.click();
        sleep(5000);
        return expcted;
    }

    void applySizeAndColor() {

        WebElement shoesSizeElement = driver.findElement(By.cssSelector("#msku-sel-1"));
        if(shoesSizeElement.isDisplayed()) {
            new Select(shoesSizeElement).selectByIndex(1);
        }
        WebElement colorElement = driver.findElement(By.cssSelector("#msku-sel-2"));
        if(colorElement.isDisplayed()) {
            new Select(colorElement).selectByIndex(1);
        }
        sleep(5000);
    }

    public void addToTrolley () {

        driver.findElement(By.cssSelector("#atcRedesignId_btn")).click();
        sleep(4000);
    }
    public void goToTrolley () {
        driver.findElement(By.xpath("//span[contains(text(),'Go to basket')]")).click();
        sleep(5000);
    }
    public List<String> getProductsInTrolley () {
        List<WebElement> ProductsInTrolley = driver.findElements(By.cssSelector("a[data-test-id='cart-item-link']"));
        List<String> allProductsInTrolley = new ArrayList<>();
        for (WebElement webelement : ProductsInTrolley) {
            String products = webelement.getText();
            allProductsInTrolley.add(products);
        }
        return allProductsInTrolley;
    }
    public double getPriceFromBasket () {
        String priceInString = driver.findElement(By.cssSelector(".item-price")).getText().replace("£", "");
        double priceInDouble = Double.parseDouble(priceInString);
        return priceInDouble;
    }
}
