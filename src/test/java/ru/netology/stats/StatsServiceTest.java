package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void showSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        int actualAmount = service.salesAmount(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void showTheAmountOfTheAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSalesAmount(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void showMonthOfBiggestSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMax = 6;
        int actualMonthMax = service.monthOfBiggestSales(sales);
        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
    }

    @Test
    public void showMonthOfTheSmallestSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMin = 9;
        int actualMonthMin = service.monthOfTheSmallestSales(sales);
        Assertions.assertEquals(expectedMonthMin, actualMonthMin);
    }

    @Test
    public void howManyMonthsOfSmallSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedHowManyMonthMin = 5;
        int actualHowManyMonthMin = service.numberOfMonthsWithLowSales(sales);
        Assertions.assertEquals(expectedHowManyMonthMin, actualHowManyMonthMin);
    }

    @Test
    public void howManyMonthsOfBigSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedHowManyMonthMax = 5;
        int actualHowManyMonthMax = service.numberOfMonthsWithHighSales(sales);
        Assertions.assertEquals(expectedHowManyMonthMax, actualHowManyMonthMax);
    }
}
