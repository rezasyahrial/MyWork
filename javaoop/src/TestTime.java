

public class TestTime {

    public static void main(String[] args) {
        Time time = new Time(30,5,12);
        System.out.println(time);

        time.setHour(12);
        time.setMinute(5);
        time.setSecond(30);
        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        time.setTime(59,59,12);
        System.out.println(time);

        System.out.println(time.nextSecond());
        System.out.println(time.nextSecond().nextSecond());
    }



}
