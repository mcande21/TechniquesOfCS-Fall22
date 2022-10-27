package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class SwallowStats {

    public static double swallow_stats() {

        // connect to the webpage of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // What is true?
        // I was able to connect ot the website.
        double sum = 0;
        double count = 0;
        String line = s.nextLine();
        while (true) {

            if (!s.hasNextLine())
                break;

            // read a line of the Web Site
            if (line.indexOf("#") >= 0 || line.length() == 0) {
                line = s.nextLine();
            } else if (line.length() != 0) {  // modify condition if length of the line is zero
                sum = sum + parseDouble(line);
                count++;
                line = s.nextLine();

            }
        }
        return (sum/count);
    }

    public static void main(String[] args){
       System.out.printf("Average swallow speeds is %.2f\n", swallow_stats());



    }
}
