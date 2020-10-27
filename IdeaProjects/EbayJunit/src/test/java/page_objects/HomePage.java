package page_objects;

import driver.DriverManager;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePage extends DriverManager {

    @FindBy(css = "input[placeholder='Search for anything']")
    private WebElement searchBox;

    @FindBy(css="//span[contains(text(),'mobile phones')]")
    private WebElement headerName;


    public void doSearch(String Item) {
        searchBox.sendKeys(Item);
        searchBox.sendKeys(Keys.ENTER);
    }

    public String actualHeader(){
        return headerName.getText();
    }


    public String currentUrl(){
        return driver.getCurrentUrl();
    }
}
