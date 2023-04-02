package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldFindSalesSum() {
        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesSum = 180;
        int actualSalesSum = service.salesSum(sales);

        Assertions.assertEquals(expectedSalesSum, actualSalesSum);

    }

    @Test
    public void shouldFindAverageSalesMonthly() {
        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectAverageSalesMonthly = 15;
        int actualAverageSalesMonthly = service.averageSalesMonthly(sales);

        Assertions.assertEquals(expectAverageSalesMonthly, actualAverageSalesMonthly);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 7;
        int actualMaxMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 8;
        int actualMinMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindBelowAverageMonths() {
        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualBelowAverage = service.belowAverageMonths(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldFindAboveAverageMonths() {
        StatService service = new StatService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualAboveAverage = service.aboveAverageMonths(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
