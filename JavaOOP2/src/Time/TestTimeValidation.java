package Time;

public class TestTimeValidation {

    public static void main(String[] args) {

        TimeValidation time = new TimeValidation(20,20,12);
        System.out.println(time);

        TimeValidation validation = new TimeValidation();
        System.out.println(validation);

        time.setSecond(20);
        time.setMinute(25);
        time.setHour(5);
        System.out.println(time);

        System.out.println("second: " + time.getSecond());
        System.out.println("minute: " + time.getMinute());
        System.out.println("hour: " + time.getHour());

    }


}
