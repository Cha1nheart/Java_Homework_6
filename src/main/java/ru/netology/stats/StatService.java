package ru.netology.stats;

public class StatService {

    public int salesSum(int[] sales) {
        int salesAmount = 0;
        for (int i : sales) {
            salesAmount += i;
        }

        return salesAmount;
    }

    public int averageSalesMonthly(int[] sales) {
        int salesAmount = salesSum(sales);
        int averageSalesMonthly = salesAmount / sales.length;

        return averageSalesMonthly;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth;
    }

    public int belowAverageMonths(int[] sales) {
        int average = averageSalesMonthly(sales);
        int belowAverageMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverageMonths++;
            }
        }

        return belowAverageMonths;
    }

    public int aboveAverageMonths(int[] sales) {
        int average = averageSalesMonthly(sales);
        int aboveAverageMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverageMonths++;
            }
        }

        return aboveAverageMonths;
    }
}