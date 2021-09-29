package tests.google_calculator.positive;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import tests.base.BaseTest;

import static constants.Constant.CalcElement.START_CALC;
import static constants.Constant.CalculatorQueryTestData.CALC_ZERO;
import static constants.Constant.Urls.SEARCH_ENGINE;
import static constants.Constant.UrlsQuery.SEARCH_QUERY;

public class DivisionByZeroPositiveTest extends BaseTest {
    //    case two:
    private final By enteredValueZero = By.xpath("//span[@class='vUGUtc' and text()='6 ÷ 0 =']");
    private final By resultZero = By.xpath("//span[@class='qv3Wpe' and text()='Infinity']");

    @Test
    public void divisionByZero(){
        basePage.goToUrl(SEARCH_ENGINE);
        googleSearchPage.searchOnInternet(SEARCH_QUERY);
        googleCalculatorPage.checkElement(START_CALC);
        googleCalculatorPage.calculateNum(CALC_ZERO);
        googleCalculatorPage.checkElement(enteredValueZero);
        googleCalculatorPage.checkElement(resultZero);
    }
}
