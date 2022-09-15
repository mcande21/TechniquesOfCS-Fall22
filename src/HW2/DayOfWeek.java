package HW2;

import java.util.Scanner;

public class DayOfWeek {

    public static double dayoftheweek(int month, int day, int year){
        int year_1 = year - ( 14 - month) / 12;
        int x = year_1 + year_1 / 4 - year_1 / 100 + year_1 / 400;
        int month_1 = month + 12 * ((14 - month) / 12) - 2;
        int day_of_week = (day + x + 31 * month_1 / 12) % 7;
        return day_of_week;
    }

    public static void main(String [] args){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a month(mm): ");
        int month_value = kbd.nextInt();
        System.out.print("Enter in the day(dd): ");
        int day_value = kbd.nextInt();
        System.out.print("Enter in the year(yyyy): ");
        int year_value = kbd.nextInt();
        System.out.printf("This date falls on the %.0f day of the week" + "😂",
                dayoftheweek(month_value, day_value, year_value));

    }
}
