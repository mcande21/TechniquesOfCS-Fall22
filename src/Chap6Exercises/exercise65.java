package Chap6Exercises;

public class exercise65 {
    /*
    * Return true if every letter in a s appears exactly twice.
     */
    public static boolean isdoubloon(String s) {

        for (int i = 0; i < s.length(); i++) {
            int cnt =0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
            }
            if (cnt != 2){
                return false;
            }
        }
        return true;
    }

    public static void main( String [] args){
        System.out.println(isdoubloon("appeases"));
        System.out.println(isdoubloon("abba"));
        System.out.println(isdoubloon("esophagographers"));
        System.out.println(!isdoubloon("apple"));

    }

}
