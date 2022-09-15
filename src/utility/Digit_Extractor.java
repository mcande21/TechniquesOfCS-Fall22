package utility;

public class Digit_Extractor {

    public static int last(int n){
        // We can take the absolute value of n
        //n = Math.abs(n);
        // Or we can write an if statement
        if (n < 0){
            n = -n;
        }
        return n%10;
    }
    public static int second_to_last(int n){
        n = Math.abs(n);
        return (n / 10) % 10;
    }

    public static void main(String [] args){
        System.out.println(last(2753) == 3);
        System.out.println(last(-749) == 9);
        System.out.println(second_to_last(2753) == 5);
        System.out.println(second_to_last(-749) == 4);
    }
}
