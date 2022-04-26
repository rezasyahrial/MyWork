package MyTime;

public class TestMyTime {

    public static void main(String[] args) {


        MyTime time = new MyTime(12,34,23);
        System.out.println(time);
        MyTime myTime = new MyTime();
        System.out.println(myTime);

        time.setTime(23,59,58);
        System.out.println(time);
        System.out.println(time.nextSecond().nextSecond());
        System.out.println(time.nextMinute());
        System.out.println(time.nextHour());


    }
}
