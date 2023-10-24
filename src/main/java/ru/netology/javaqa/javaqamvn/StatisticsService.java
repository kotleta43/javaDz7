package ru.netology.javaqa.javaqamvn;

public class StatisticsService {
    public static long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}