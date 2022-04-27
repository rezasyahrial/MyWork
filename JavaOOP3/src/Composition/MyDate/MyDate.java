package Composition.MyDate;

public class MyDate {

    private int year;
    private int month;
    private int day;
    private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    private static final int[] dayInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static final int[] nonLeapYear = {0,3,3,6,1,4,6,2,5,0,3,5};
    private static final int[] leapyear = {6,2,3,6,1,4,6,2,5,0,3,5};

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day){
        return (year >= 0 && year <= 9999) && (month >=1 && month <= 12) && (day >=1 && day <= 366);
    }

    public static int getMonthLastDay(int year, int month) {
        return dayInMonths[month-1] + (isLeapYear(year) && month == 2 ? 1 : 0 );
    }

    public static int getDayOfWeek(int year, int month, int day){
        if (! isValidDate(year, month, day)) {
            return -1;
        }

        // 1. Based on the first two digit of the year, get the number from the "century" table.
        int magicCenturyNumber = 6 - 2*((year / 100) % 4);

        // 2. Add to the last two digit of the year.
        int lastTwoDigitsOfYear = year % 100;

        // 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
        int magicYearNumber = lastTwoDigitsOfYear / 4;

        // 4. Add to the number obtained from the month table.
        int magicMonthNumber = isLeapYear(year) ? leapyear[month-1] : nonLeapYear[month-1];

        // 5. Add to the day.
        int magicDayNumber = day;

        // 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
        return (  magicCenturyNumber + lastTwoDigitsOfYear
                + magicYearNumber    + magicMonthNumber + magicDayNumber) % 7;
    }


    public void setDate(int year, int month, int day)
    {
        if (! isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    public MyDate nextDay()
    {
        int maxDay = getMonthLastDay(year, month);
        if (maxDay == day && 12 == month && 9999 == year) {
            return this;
        }

        if (maxDay == day && 12 == month) {
            setDate(year+1, 1, 1);
            return this;
        }

        if (maxDay == day) {
            setDate(year, month+1, 1);
            return this;
        }

        setDate(year, month, day+1);
        return this;
    }

    public MyDate nextMonth()
    {
        if (12 == month && 9999 == year) {
            return this;
        }

        int maxDay = (12 == month)
                ?   getMonthLastDay(year+1, 1)
                :   getMonthLastDay(year, month+1);

        if (day == getMonthLastDay(year, month)) {
        }
        else if (day > maxDay) {
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        if (12 == month) {
            setDate(year+1, 1, maxDay);
            return this;
        }

        setDate(year, month+1, maxDay);
        return this;
    }

    public MyDate previousDay()
    {
        if (1 == day && 1 == month && 0 == year) {
            return this;
        }

        if (1 == day && 1 == month) {
            setDate(year-1, 12, getMonthLastDay(year-1, 12));
            return this;
        }

        if (1 == day) {
            setDate(year, month-1, getMonthLastDay(year, month-1));
            return this;
        }

        setDate(year, month, --day);
        return this;
    }

    public MyDate previousMonth()
    {
        if (1 == month && 0 == year) {
            return this;
        }

        int maxDay = (1 == month)
                ?   getMonthLastDay(year-1, 12)
                :   getMonthLastDay(year, month-1);

        if (day == getMonthLastDay(year, month)) {
        }
        else if (day > maxDay) {
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        if (1 == month) {
            setDate(year-1, 12, maxDay);
            return this;
        }

        setDate(year, month-1, maxDay);
        return this;
    }

    public MyDate previousYear()
    {
        if (0 == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year-1, month);

        if (day == getMonthLastDay(year, month)) {
        }
        else if (day > maxDay) {
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year-1, month, maxDay);
        return this;
    }

    public MyDate nextYear(){
        if (12 == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year+1, month);

        if (day == getMonthLastDay(year, month)) {
        }
        else if (day > maxDay) {
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year+1, month, maxDay);
        return this;
    }

    public String toString() {
        int weekDay = getDayOfWeek(year, month, day);
        return String.format("%1$s %2$d %3$s %4$d", days[weekDay], day, months[month-1], year);
    }


}
