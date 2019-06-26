/**
 * Clock class represents a digital clock that can be used to keep track of elapsed time in terms of
 * number of days, hours, minutes, and seconds.
 *
 * @author Sadegh Babapour
 *
 */

public class Clock {

    /**
     * the day, hour, inute and seconds required to the time by this clock.
     */

    private int day, hour, minute, second;

    /**
     * gets the day
     *
     * @return the current day
     */

    public int getDay() {
        return day;
    }

    /**
     *gets the hour
     *
     * @return the current hour
     */
    public int getHour() {
        return hour;
    }

    /**
     *gets the minute
     *
     * @return the current minute
     */

    public int getMinute() {
        return minute;
    }

    /**
     *gets the second
     *
     * @return the current second
     */

    public int getSecond() {
        return second;
    }

    /**
     * sets the day
     * @param value the desired value to be set to the day
     */

    public void setDay(int value) {
        day = value;
    }

    /**
     * sets the hour
     * @param value the desired value to be assigned to the hour
     */

    public void setHour(int value) {
        if (value >= 0 && value <= 23) {
            hour = value;
        } else {
            System.out.println("out of bound entry");
            hour = 0;
        }
    }

    /**
     * sets the minute
     * @param value the desired value to be assigned to the minute
     */

    public void setMinute(int value) {
        if (value >=0 && value <= 59)
            minute = value;
        else {
            System.out.println("out of bound entry");
            minute = 0;

        }
    }

    /**
     * sets the second
     * @param value the desired value to be assigned to the second
     */

    public void setSecond(int value) {
        if (value >=0 && value <= 59)
            second = value;
        else {
            System.out.println("out of bound entry");
            second = 0;
        }
    }

    /**
     * constructor that sets the class data fields to the values supplied by the
     * constructor’s arguments
     *
     * @param dayVal value of the  class field: day
     * @param hourVal value of the  class field: hour
     * @param minuteVal value of the  class field: minute
     * @param secondVal value of the  class field: second
     */

    public Clock(int dayVal, int hourVal, int minuteVal, int secondVal) {
        day = dayVal;
        hour = hourVal;
        minute = minuteVal;
        second = secondVal;

    }

    /**
     * default constructor that sets all the data fields to zero by calling the other
     * constructor.  
     */


    public Clock() {

    }

    /**
     * method called increment that increments the value of time by multiple seconds with
     * a single call.
     * @param value increment value in terms if seconds
     */

    public void increment(int value){
        // 24 hours in a day, 60 minutes in an hour, 60 seconds in a minute (86400)
        int tday = value / (24 * 60 * 60);
        int thour = (value % 86400) / 3600;
        int tminute = ((value % 86400) % 3600) /60;
        int tsecond = value % 86400 % 3600 %60 %60;

        second += tsecond;
        if (second >= 60) {
            tminute += second /60;
            second %= 60;
        }

        minute += tminute;
        if (minute >= 60){
            thour += minute/60;
            minute %= 60;
        }

        hour += thour;
        if (hour >= 24) {
            tday += hour /24 ;
            hour %= 24;
        }

        day += tday;
    }

    /**
     * method called calculateTotalSeconds that returns the total time in seconds.
     * @return total seconds of elapsed time; initial time plus the increment
     */

    public int  calculateTotalSeconds() {
        int totalsec = (day * 24 * 60 * 60) + (hour * 60 * 60) + minute * 60 + second ;
        return totalsec;
    }


    public static void main(String[] args) {

        // Create elapsed time with the default values of zeros for day, hour,
        // minute and second.
        Clock t1 = new Clock(); // Default constructor

        // sets hour to 23
        t1.setHour(23);
        // sets day to 1
        t1.setDay(1);
        // sets minute to 59
        t1.setMinute(59);
        // sets day to 16
        t1.setSecond(16);

        // prints: 1:23:59:16
        System.out.println(t1.getDay() + ":" + String.format("%02d",t1.getHour()) +":" + String.format("%02d",t1.getMinute()) + ":" + String.format("%02d",t1.getSecond()));

        // increments time t1 by 44 seconds:
        t1.increment(104);
        // prints: 2:0:0:0
        System.out.println(t1.getDay() + ":" + String.format("%02d",t1.getHour()) +":" +String.format("%02d",t1.getMinute()) + ":" + String.format("%02d",t1.getSecond()));

        // prints the total elapsed time in seconds: 172,800
        System.out.printf("The elapsed time in seconds is: %d", t1.calculateTotalSeconds());
        System.out.println();
        // REPEAT SIMILAR TESTS FOR t2
        //Elapsed time is 3 days, 1 hour, 4 mins and 5 secs
        Clock t2 = new Clock(3, 1, 4, 5);

        // prints: 1:23:59:16
        System.out.println(t2.getDay() + ":" + String.format("%02d",t2.getHour()) +":" + String.format("%02d",t2.getMinute()) + ":" + String.format("%02d",t2.getSecond()));

        // increments time t1 by 500 seconds:
        t2.increment(44);
        // prints: 2:0:0:0
        System.out.println(t2.getDay() + ":" + String.format("%02d",t2.getHour())  + ":" +String.format("%02d",t2.getMinute()) + ":" + String.format("%02d",t2.getSecond()));

        // prints the total elapsed time in seconds: 172,800
        System.out.printf("The elapsed time in seconds is: %d", t2.calculateTotalSeconds());
        System.out.println();

        Clock t3 = new Clock();
        System.out.println(t3.getDay() + ":" + t3.getHour() +":" + t3.getMinute() + ":" + t3.getSecond());

    }

}
