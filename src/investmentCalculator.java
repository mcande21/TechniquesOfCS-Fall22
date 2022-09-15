import HW3.Investment;

import java.util.Scanner;


public class investmentCalculator {

    public static void main(String [] args) {

        // prompt the user for c, r, t, n
        // and call the function with the inputted values
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter in your initial investment: ");
        double c_value = kbd.nextDouble();

        System.out.print("Enter in your rate: ");
        double r_value = kbd.nextDouble();

        System.out.print("Enter in your years: ");
        int t_value = kbd.nextInt();

        System.out.print("Enter in your compound: ");
        int n_value = kbd.nextInt();

        System.out.printf("Your amount comes out to: %.2f. ",
                Investment.investment(c_value, r_value, t_value, n_value));

    }
}
