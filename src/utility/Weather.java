package utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double degrees, double wind_speed) {
        double t = degrees;
        double V = Math.pow(wind_speed, 0.16);
        double W = 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * (V);
        return W;
    }

    public static double getVelocity(Scanner s) {
        boolean valid = false;
        double velocity = 0;
        while (true) {
            System.out.print("Enter wind velocity in degrees MPH: ");
            if (s.hasNextDouble()) {
                velocity = s.nextDouble();
                if (velocity < 0) {
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f\n", velocity);
                } else {
                    break;
                }
            } else {
                System.out.printf("Error: you did not enter a valid wind speed. You entered \"%s\" \n",
                        s.next());
            }
        }
        return velocity;
    }

    public static double getTemp(Scanner s) {
        boolean valid = true;
        double temperature = 0;
        while (true) {
            System.out.print("Enter temperature in degrees F: ");
            if (s.hasNextDouble()) {
                temperature = s.nextDouble();
            } else {
                System.out.printf("Error: please enter a valid number. You entered \"%s\"\n",
                        s.next());
            }
            return temperature;
        }
    }

    public static void main(String[] args) {

        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        double velocity = getVelocity(kbd);
        double temperature = getTemp(kbd);

        System.out.printf("Windchill is %.2f\n", windchill(temperature, velocity));
        System.out.printf("The Windchill for %.0f degrees and %.0f MPH winds is: %.2f degrees\n",
                temperature, velocity, windchill(temperature, velocity));
        // System.out.println("They said \"Don't do it!!\".");
    }

}
