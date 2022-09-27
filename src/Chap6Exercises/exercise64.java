package Chap6Exercises;

public class exercise64 {

    public static String toLower(String s){
        String r = "";
        for ( int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                r = r + (char) ('a' + (ch - 'A'));
            }
            else r = r + ch;
        }
        return r;
    }

    /* Method vs. Function difference
    -Methods are defined, call an object, calla method, using dot-notation, on an object Ex: s.length() where "s" is object
    -Functions are defined on a class and are called using the name of the class or (no class) if
    the call is within the same class where the function si defined. EX: Exercise64.toLower(s)
    -In other words, functions are defined in the class youre in while methods are functions
    being called outside of the class.
    - Summarize: Methods are called on an object EX: s.toLower() where "s" is the subject
                 Functions are called on a class EX: Exercise64.toLower() where "Exercise64" is class, not object.
     */
    public static boolean isAlphabetical(String s){
        s = s.toLowerCase();
        s = toLower(s);
        // rewrite using a while loop.
        int x = 0;
        while(x < s.length() - 1){
            if (s.charAt(x) > s.charAt(x + 1)){
                return false;
            }
            x++;
        }
        return true;
    }

    public static void main( String [] args){
        System.out.println(toLower("APPLE"));
        System.out.println(toLower("ApPLe"));
        System.out.println(toLower("Apple!^&%"));
        System.out.println(isAlphabetical("biopsy"));
        System.out.println(!isAlphabetical("apple"));
    }
}
