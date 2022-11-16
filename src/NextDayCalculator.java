public class NextDayCalculator {

    public static String displayNextDate(int day, int month, int year) {
        boolean isLeapYear = checkLeapYear(year);

        if (isLeapYear) {
            return nextDateInLeapYear(day, month, year);
        } else {
            return nextDayInCommonYear(day, month, year);
        }
    }

    private static String nextDayInCommonYear(int day, int month, int year) {
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
            if (day < 31 && day >= 1) {
                day += 1;
            } else if (day == 31) {
                day -= 30;
                month += 1;
            }
            break;
        case 12:
            if (day < 31 && day >= 1) {
                day += 1;
            } else if (day == 31) {
                day -= 30;
                month -= 11;
                year += 1;
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
            if (day < 28 && day >= 1) {
                day += 1;
            } else if (day == 28) {
                day -= 27;
                month += 1;
            }
            break;
        }
        return day + "/" + month + "/" + year;
    }

    private static String nextDateInLeapYear(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31 && day >= 1) {
                    day += 1;
                } else if (day == 31) {
                    day -= 30;
                    month += 1;
                }
                break;
            case 12:
                if (day < 31 && day >= 1) {
                    day += 1;
                } else if (day == 31) {
                    day -= 30;
                    month -= 11;
                    year += 1;
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
                if (day < 29 && day >= 1) {
                    day += 1;
                } else if (day == 29) {
                    day -= 28;
                    month += 1;
                }
                break;
        }
        return day + "/" + month + "/" + year;
    }

    private static boolean checkLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
