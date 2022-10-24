package ru.netology.stats;


public class StatsService {
    public int salesAmount(int[] sales) {
        int amount = 0;

        for (int sum : sales) {
            amount = amount + sum;
        }
        return amount;

    }

    public int averageSalesAmount(int[] sales) {
        int amount = salesAmount (sales);
        int numberOfDays = sales.length;
        int averageSalesAmount = amount / numberOfDays;
        return averageSalesAmount;
    }
    public int monthOfBiggestSales(int[] sales) {
        int maxMonth = 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth+1;
    }

    public int monthOfTheSmallestSales(int[] sales) {
        int minMonth = 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth+1;
    }

    public int numberOfMonthsWithLowSales(int[] sales) {
        int numberOfMonthMin = 0;
        for (int month : sales) {
            if (month < averageSalesAmount (sales)) {
                numberOfMonthMin++;
            }
        }
        return numberOfMonthMin;
    }

    public int numberOfMonthsWithHighSales(int[] sales) {
        int numberOfMonthMax = 0;
        for (int month : sales) {
            if (month > averageSalesAmount (sales)) {
                numberOfMonthMax++;
            }
        }
        return numberOfMonthMax;
    }
}
