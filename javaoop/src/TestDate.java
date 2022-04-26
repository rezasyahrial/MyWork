

public class TestDate {
    public static void main(String[] args) {

        Date date = new Date(2022, 4, 25);
        System.out.println(date);

        date.setDay(25);
        date.setMonth(4);
        date.setYear(2022);
        System.out.println(date);

        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

        date.setDate(2022,4,25);
        System.out.println(date);



    }

}
