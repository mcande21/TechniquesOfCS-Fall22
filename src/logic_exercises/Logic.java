package logic_exercises;

public class Logic {

    public static int caughtspeeding(int speed, boolean isbirthday){
        if (isbirthday){
            speed = speed - 5;
        }
        if (speed <= 60){
        return 0;}

        else if (speed <= 80){
            return 1;}

        else{
            return 2;}
        }


    public static boolean cigarParty(int cigars, boolean isWeekend){
        if (isWeekend){
            return true;
        }
        else
            return cigars >= 40 && cigars <= 60;
        }


    public static boolean ordered(int d1, int d2, int d3){
        return (d1<d2 && d2<d3) || (d3<d2 && d2<d1);

    }

    public static void main(String[] args){

        System.out.println(caughtspeeding(60, false) == 0);
        System.out.println(caughtspeeding(65, false) == 1);
        System.out.println(caughtspeeding(65, true) == 0);
        System.out.println(caughtspeeding(81, false) == 2);
        System.out.println(caughtspeeding(81, true) == 1);
        System.out.println("----------------------------------------------");
        System.out.println(cigarParty(30, false) == false);
        System.out.println(cigarParty(50, false) == true);
        System.out.println(cigarParty(70, true) == true);
        System.out.println("----------------------------------------------");
        System.out.println(ordered(2, 3, 4) == true);
        System.out.println(ordered(5, 2, 3) == false);
        System.out.println(ordered(5, 4, 3) == true);
        System.out.println(ordered(7, 9, 3) == false);
        System.out.println(ordered(4, 4, 4) == false);

    }
}
