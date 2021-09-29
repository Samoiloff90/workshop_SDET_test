package pages.google_calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import static constants.Constant.CalcElement.START_CALC;
import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class GoogleCalculatorPage extends BasePage {
    WebDriver driver;
    public GoogleCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Search engine query method
     **/
    public GoogleCalculatorPage calculateNum(String query) {
        driver.findElement(START_CALC).sendKeys(query, Keys.ENTER);
        return this;
    }

    /**
     * Wait for visibility element in DOM model
     **/
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    /**
     * Check element
     **/
    public void checkElement(By elem) {
        WebElement enterValue = driver.findElement(elem);
        waitElementIsVisible(enterValue);
    }
}
