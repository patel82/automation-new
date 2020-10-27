package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TrolleyPage extends DriverManager {

    @FindBy(css = "a[data-test-id='cart-item-link']")
    private List<WebElement> productsInTrolleyName;

    @FindBy(css = ".item-price")
    private WebElement productPriceLbl;

    public List<String> getProductsInTrolley () {
        List<String> allProductsInTrolley = new ArrayList<>();
        for (WebElement webelement : productsInTrolleyName) {
            String products = webelement.getText();
            allProductsInTrolley.add(products);
        }
        return allProductsInTrolley;
    }

    public double getPriceFromBasket () {
        String priceInString = productPriceLbl.getText().replace("£", "");
        double priceInDouble = Double.parseDouble(priceInString);
        return priceInDouble;
    }
}
