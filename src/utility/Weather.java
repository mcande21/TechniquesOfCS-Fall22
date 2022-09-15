package utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double degrees, double wind_speed){
        double t = degrees;
        double V = Math.pow(wind_speed, 0.16);
        double W = 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * (V);
        return W;
    }
    public static void main(String [] args) {

        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter temperature in degrees F: ");
        double temperature;

        if (kbd.hasNextDouble() == true) {
            temperature = kbd.nextDouble();
        }
        else {
            System.out.printf("Error: please enter a valid number. You entered \"%s\"",
                  kbd.next());
            return; // exit main
        }

        System.out.print("Enter wind velocity in degrees MPH: ");
        double velocity;
        if (kbd.hasNextDouble()) {
            velocity = kbd.nextDouble();
        }
        else{
            System.out.printf("Error: you did not enter a valid wind speed. You entered \"%s\"", kbd.next());
            return;
        }

        System.out.printf("Windchill is %.2f\n", windchill(temperature, velocity));
        System.out.printf("The Windchill for %.0f degrees and %.0f MPH winds is: %.2f degrees\n",
                temperature, velocity, windchill(temperature,velocity));
        // System.out.println("They said \"Don't do it!!\".");


    }

}
