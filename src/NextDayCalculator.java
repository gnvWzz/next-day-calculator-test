public class NextDayCalculator {
    public static String displayNextDate(int day, int month, int year) {
        return nextDate(day,month,year);
    }
    private static String nextDate(int day, int month, int year) {
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            if (day < 31 && day >= 1 && month != 12) {
                day++;
            } else if (day == 31 && month == 12) {
                day -= 30;
                month -= 11;
                year++;
            } else {
                day = 1;
                month++;
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            if (day < 30 && day >= 1) {
                day += 1;
            } else if (day == 30) {
                day -= 29;
                month += 1;
            }
            break;
        case 2:
            if (day < 28) {
                day++;
            } else {
                if (checkLeapYear(year)) {
                    if (day == 28) {
                        day++;
                    } else if (day == 29) {
                        day = 1;
                        month++;
                    }
                } else {
                    day = 1;
                    month++;
                }
            }
        }
        return day + "/" + month + "/" + year;
    }
    private static boolean checkLeapYear(int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy4) {
            if (isDivisibleBy100) {
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
