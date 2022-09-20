package HW3;

import java.io.PrintStream;
import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }
    public static double get_cost(Scanner s) {
        double cost = 0;
        while (true) {
            Scanner kbd = new Scanner(System.in);
            System.out.print("Please enter your initial investment: ");
            if (kbd.hasNextDouble()) {
                cost = kbd.nextDouble();
                if (cost < 0) {
                    System.out.println("The value you entered is not a positive number. Please try again");
                }
                else{
                    break;
                }}
            else {
                System.out.println("Error: The value you entered does not compute. Please try again");
            }}
        return cost;
    }
    public static double get_rate(Scanner s) {
        double rate = 0;
        while (true){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter your rate of investment(in decimal form): ");
        if (kbd.hasNextDouble()) {
            rate = kbd.nextDouble();
            if (rate < 0 || rate > 1){
                System.out.println("The rate you entered is below zero. That makes no sense. Please try again");
            }
            else {
                break;
            }
        } else {
            System.out.println("The value you entered does not compute. Please try again.");
        }}
        return rate;
    }

    public static int get_time(Scanner s) {
        int year = 0;
        while(true){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter your time frame: ");
        if (kbd.hasNextInt()) {
            year = kbd.nextInt();
            if (year < 0){
                System.out.println("The year is a negative. That makes no sense.");
            }
            else {
                break;
            }
        } else {
            System.out.println("The value you entered does not compute. Please try again.");
        }}
        return year;
    }

    public static int get_compound(Scanner s) {
        int n = 0;
        while (true){
        Scanner kbd = new Scanner(System.in);
        System.out.print("PLease enter the amount you are compounding per year: ");
        if (kbd.hasNextInt()) {
            n = kbd.nextInt();
            if (n < 0){
                System.out.println("The rate you compound is a negative. That makes no sense. Please try again");
            }
            else{
                break;
            }
        } else {
            System.out.println("The value you entered does not compute. Please try again.");
        }}
        return n;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double cost = get_cost(kbd);
        double rate = get_rate(kbd);
        int year = get_time(kbd);
        int n = get_compound(kbd);
        System.out.printf("The total value of your investment is $%.2f",
                investment(cost, rate, year, n));

        //System.out.println(investment(1.0, 1.0, 1, (int)1e9));
        //System.out.println(investment(1.0, 1.0, 1, (int)1e9));
        //System.out.println(investment(1.0, 1.0, 1, (int)1e9));
    }
}
