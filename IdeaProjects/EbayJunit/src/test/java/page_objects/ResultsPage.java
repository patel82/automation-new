package page_objects;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.RandomHelper;

import java.util.List;

public class ResultsPage extends DriverManager {

    private RandomHelper randomHelper = new RandomHelper();

    @FindBy(className = "s-item__title")
    private List<WebElement> productsName;

    @FindBy(css = "#msku-sel-1")
    private WebElement shoesSize;

    @FindBy(css = "#msku-sel-2")
    private WebElement shoesColor;

    public String selectAnyProduct() {
        int indexnumber =randomHelper.randomnumber(productsName.size());
        WebElement selectedelement = productsName.get(indexnumber);
        String expcted = selectedelement.getText();
        selectedelement.click();
        sleep(5000);
        return expcted;
    }

    public void applySizeAndColor() {

       if(shoesSize.isDisplayed()) {
            new Select(shoesSize).selectByIndex(1);
        }

        if(shoesColor.isDisplayed()) {
            new Select(shoesColor).selectByIndex(1);
        }
        sleep(5000);
    }
}
