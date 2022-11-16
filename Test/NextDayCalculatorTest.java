import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void displayNextDateOfLastDayFebruaryLeapYear() {
        int year = 2020;
        int month = 2;
        int day = 29;
        int monthAfter = month + 1;
        int dayAfter = day - 28;

        String dateExpected = dayAfter + "/" + monthAfter + "/" + year;

        String dateActual = NextDayCalculator.displayNextDate(day,month,year);
        assertEquals(dateExpected,dateActual);
    }

    @Test
    void displayNextDateOfFirstDayJanuaryNormalYear() {
        int year = 2018;
        int month = 1;
        int day = 1;

        String dateExpected = 2 + "/" + month + "/" + year;

        String dateActual = NextDayCalculator.displayNextDate(day,month,year);
        assertEquals(dateExpected,dateActual);
    }

    @Test
    void displayNextDateOfLastDayJanuaryNormalYear() {
        int year = 2018;
        int month = 1;
        int day = 31;

        String dateExpected = 1 + "/" + 2 + "/" + year;

        String dateActual = NextDayCalculator.displayNextDate(day,month,year);
        assertEquals(dateExpected,dateActual);
    }

    @Test
    void displayNextDateOfLastDayAprilLeapYear() {
        int year = 2018;
        int month = 4;
        int day = 30;

        String dateExpected = 1 + "/" + 5 + "/" + year;

        String dateActual = NextDayCalculator.displayNextDate(day,month,year);
        assertEquals(dateExpected,dateActual);
    }

    @Test
    void displayNextDateOfLastDayFebruaryNormalYear() {
        int year = 2018;
        int month = 2;
        int day = 28;

        String dateExpected = 1 + "/" + 3 + "/" + year;

        String dateActual = NextDayCalculator.displayNextDate(day,month,year);
        assertEquals(dateExpected,dateActual);
    }

    @Test
    void displayNextDateOfLastDayDecemberNormalYear() {
        int year = 2018;
        int month = 12;
        int day = 31;

        String dateExpected = 1 + "/" + 1 + "/" + (year + 1);

        String dateActual = NextDayCalculator.displayNextDate(day,month,year);
        assertEquals(dateExpected,dateActual);
    }
}