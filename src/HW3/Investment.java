package HW3;

import java.io.PrintStream;
import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n){
        return c * Math.pow(1 + r/n, t*n);
    }
    public static void exit(){}

    public static void main(String [] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter your initial investment: \n");
        double cost = 0;
        if (kbd.hasNextDouble()){
            cost = kbd.nextDouble();}
        else {
            System.out.println("The value you entered does not compute. Please try again.");
            exit();}
        System.out.print("Please enter your rate of investment: \n");
        double rate = 0;
        if (kbd.hasNextDouble()){
            rate = kbd.nextDouble();}
        else {
            System.out.println("The value you entered does not compute. Please try again.");
            exit();}
        System.out.print("Please enter your time frame: \n");
        int year = 0;
        if (kbd.hasNextInt()){
            year = kbd.nextInt();}
        else {
            System.out.println("The value you entered does not compute. Please try again.");
            exit();}
        System.out.print("PLease enter the amount you are compounding per year: \n");
        int n = 0;
        if (kbd.hasNextInt()){
            n = kbd.nextInt();}
        else {
            System.out.println("The value you entered does not compute. Please try again.");
            exit();}

        System.out.printf("The total value of your investment is $%.2f",
                investment(cost, rate, year, n));

        //System.out.println(investment(1.0, 1.0, 1, (int)1e9));
        //System.out.println(investment(1.0, 1.0, 1, (int)1e9));
        //System.out.println(investment(1.0, 1.0, 1, (int)1e9));
    }
}
