package HW1;

public class time {
    public static String display_clock(int hour, int minute){
        String sentence = (hour + ":" + minute);
        return sentence;
      }
    public static double since_midnight(int hour, int minute){
        hour = 13;
        minute = 45;
       return ((hour * 60) + minute) * 60;}

    public static double remaining_seconds(int hour, int minute){
        int Seconds_sofar = ((hour * 60) + minute) * 60;
        int Seconds_left = ((24 * 60) * 60) - Seconds_sofar;
        return Seconds_left;}

    public static double percentage_of_day(int hour, int minute){
        double seconds = since_midnight(hour, minute);
        double time_in_day = ((24 * 60) * 60);
        double percentage = (seconds / time_in_day) * 100;
        return percentage;
    }

    public static double Time_since_started(int hour1, int minute1, int hour2, int minute2){
        int new_hour = (hour2 - hour1) * 60 *60;
        int new_minute = (minute2 - minute1) *60;
        int seconds = new_hour + new_minute;
        return seconds;
    }

    public static void main(String[] args) {
        System.out.printf("The time is %s.\n", display_clock(13, 45));
        System.out.printf("It has been %.0f seconds since midnight.\n", since_midnight(13,45));
        System.out.printf("There are %.0f seconds remiaining in the day.\n", remaining_seconds(13, 45));
        System.out.printf("So far we have gone %.0f percent through the day.\n", percentage_of_day(13, 45));
        System.out.printf("It has been %.0f seconds since I started this assignment",
                Time_since_started(13, 45, 16, 16));




    }

}
