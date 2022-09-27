package Exam1;

import java.util.Scanner;

public class Exam1 {

    public static int getnumber(Scanner s){
        boolean valid = true;
        int number = 0;
        while (valid){
            System.out.println("Please enter a number: ");
            if (s.hasNextInt()){
            number = s.nextInt();
            valid = false;
        } else{ System.out.printf("The number you entered is invalid. Please try again. \n", s.next());}
        }return number;}
    public static int number7(int number){
        int cnt = 0;
        while (number > 0) {
            int x = number % 10;
            if (x>2 && x<7) {
                cnt++;
                number = number / 10;
            }
            else number = number/10;
        }
        return cnt;}


    public static void main( String [] args) {
        Scanner kbd = new Scanner(System.in);
        int number = getnumber(kbd);

        System.out.println(number7(number));

    }

}
