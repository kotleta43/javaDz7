package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }@Test

    void testFindMaxWithNegativeValues() {
        long[] incomes = {-10, -5, -20, -15,};
        long expected = -5;
        long actual = StatisticsService.findMax(incomes);
        assertEquals(expected, actual);
    }
}