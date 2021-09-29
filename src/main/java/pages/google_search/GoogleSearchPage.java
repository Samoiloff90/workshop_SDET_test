package pages.google_search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class GoogleSearchPage extends BasePage {
    WebDriver driver;
    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By searchBar = By.xpath("//input[@name=\"q\"]");

    /**
     * Search engine query method
     **/
    public GoogleSearchPage searchOnInternet(String query) {
        driver.findElement(searchBar).sendKeys(query, Keys.ENTER);
        return this;
    }

}
