package constants;

import org.openqa.selenium.By;

public class Constant {
    public static class TimeoutVariables{
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls{
        public static final String SEARCH_ENGINE = "https://www.google.com/";
    }

    public static class UrlsQuery{
        public static final String SEARCH_QUERY = "Калькулятор";
    }

    public static class  CalculatorQueryTestData{
        public static final String CALC_INTEGER = "(1 + 2) × 3 - 40 / 5";
        public static final String CALC_ZERO = "6 / 0";
        public static final String CALC_NULL = "sin";
    }

    public static class  CalcElement{
        public static final By START_CALC = org.openqa.selenium.By.xpath("//div[@class='jlkklc']");;

    }
}
