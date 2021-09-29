package tests.google_calculator.positive;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.base.BaseTest;

import static constants.Constant.CalcElement.START_CALC;
import static constants.Constant.CalculatorQueryTestData.CALC_INTEGER;
import static constants.Constant.Urls.SEARCH_ENGINE;
import static constants.Constant.UrlsQuery.SEARCH_QUERY;

public class CheckingIntegerOperationsPositiveTest extends BaseTest {
    //    case one:
    private final By enteredValueInteger = By.xpath("//span[@class='vUGUtc' and text()='(1 + 2) × 3 - 40 ÷ 5 =']");
    private final By resultInteger = By.xpath("//span[@class='qv3Wpe' and text()='1']");

    @Test
    public void calculateTheNumber(){
        basePage.goToUrl(SEARCH_ENGINE);
        googleSearchPage.searchOnInternet(SEARCH_QUERY);
        googleCalculatorPage.checkElement(START_CALC);
        googleCalculatorPage.calculateNum(CALC_INTEGER);
        googleCalculatorPage.checkElement(enteredValueInteger);
        googleCalculatorPage.checkElement(resultInteger);
    }
}
