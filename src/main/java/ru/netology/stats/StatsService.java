package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {

        long totalSale = 0;
        for (long sale : sales) {

            totalSale += sale;
        }
        return totalSale;
    }

    public long averageValueSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {

            totalSale += sale;
        }

        long averageValue = 0;

        averageValue = totalSale / sales.length;

        return averageValue;


    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int subAverageSales(long[] sales) {

        int subMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageValueSales(sales) > sales[i]) {
                subMonth++;
            }
        }

        return subMonth;
    }

    public int higherAverageSales(long[] sales) {

        int higherMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageValueSales(sales) < sales[i]) {
                higherMonth++;
            }
        }

        return higherMonth;
    }
}

