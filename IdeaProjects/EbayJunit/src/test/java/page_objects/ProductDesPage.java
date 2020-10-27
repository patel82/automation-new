package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDesPage extends DriverManager {

    @FindBy(css = "#atcRedesignId_btn")
    private WebElement addToTrolleyBtn;

    @FindBy(xpath = "//span[contains(text(),'Go to basket')]")
    private WebElement goToTrolleyBtn;

    public void addToTrolley() {
        addToTrolleyBtn.click();
    }

    public void goToTrolley() {
        goToTrolleyBtn.click();
    }
}
