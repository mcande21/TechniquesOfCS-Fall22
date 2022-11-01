package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

import static ArrayExamples.SelectionSort.smallest_loc;
import static RecursionExamples.Recursion.removeSpaces;
import static RecursionExamples.Recursion.reverse;

public class Exam {

    public static boolean isPalindrome(String s) {
        s = removeSpaces(s);
        return s.equals(reverse(s));
    }
    public static String [] reversepali(String [] aos) {
        String[] reverse = new String[9];
        int counter = 0;
        for (int i = aos.length-1; i >= 0; i--) {
            reverse[counter] = aos[i];
            counter++;
        }
        return reverse;
    }

    public static String [] load_words(String path, int n) {
        URL url = null; // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        int i = 0;

        while (s.hasNextLine()){
            words[i++] = s.nextLine();
        }
        String [] pali = new String [9];
        int counter = 0;
        for (int x = 0; x <words.length; x++) {
            if (isPalindrome(words[x])) {
                pali[counter] = words[x];
                counter++;
            }
        }

        return pali;
    }

    public static void main(String[] args) {
        String [] pali = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        System.out.println(Arrays.toString(reversepali(pali)));
    }

}
