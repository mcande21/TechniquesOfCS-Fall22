package HW5;

public class Exercise66 {

    public static boolean canSpell(String word,String tiles){

        for (int i = 0; i < word.length(); i++){
          char Char = word.charAt(i);
          int index = tiles.indexOf(Char);
          if (index >= 0){
              tiles = tiles.substring(0, index) + tiles.substring(index + 1, tiles.length());
          }
          if (index < 0){
              return false;
          }
        }
    return true;}

    public static void main(String [] args){
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("pile", "piles"));
        System.out.println(!canSpell("pile", "Doghouse"));
    }

}
