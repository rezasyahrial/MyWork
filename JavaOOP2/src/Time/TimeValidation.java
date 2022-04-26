package Time;

public class TimeValidation {

    private int second;
    private int minute;
    private int hour;

    public void setSecond(int second) {
        if (second >=0 && second <= 59){
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("error: invalid second");
        }
    }

    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("error: invalid minute");
        }
    }

    public void setHour(int hour){
        if(hour >=0 && hour <=59){
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("error: invalid hour");
        }
    }

    public void setTime(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public TimeValidation(int second, int minute, int hour){
        this.setTime(second, minute, hour);
    }

    public TimeValidation(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public String toString(){
        return String.format("%02d:%02d%02d", hour,minute,second);
    }

    public TimeValidation nextSecond(){
        ++second;
        if(second == 60){
            second = 0;
            ++minute;
            if (minute == 60){
                minute = 0;
                ++hour;
            } if (hour == 24){
                hour = 0;
            }
        }
        return this;
    }
}
