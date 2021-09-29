package tests.google_calculator.positive;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.base.BaseTest;

import static constants.Constant.CalcElement.START_CALC;
import static constants.Constant.CalculatorQueryTestData.CALC_NULL;
import static constants.Constant.Urls.SEARCH_ENGINE;
import static constants.Constant.UrlsQuery.SEARCH_QUERY;

public class ErrorCheckForMissingValuePositiveTest extends BaseTest {
    //    case three:
    private final By enteredValueNull = By.xpath("//span[@class='vUGUtc' and text()='sin(']");
    private final By resultError = By.xpath("//span[@class='qv3Wpe' and text()='Error']");

    @Test
    public void incompleteValue(){
        basePage.goToUrl(SEARCH_ENGINE);
        googleSearchPage.searchOnInternet(SEARCH_QUERY);
        googleCalculatorPage.checkElement(START_CALC);
        googleCalculatorPage.calculateNum(CALC_NULL);
        googleCalculatorPage.checkElement(enteredValueNull);
        googleCalculatorPage.checkElement(resultError);
    }
}
