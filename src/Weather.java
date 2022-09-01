public class Weather {

    public static double windchill(double degrees, double wind_speed){
        double t = degrees;
        double V = Math.pow(wind_speed, 0.16);
        double W = 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * (V);
        return W;
    }
    public static void main(String [] args) {
        System.out.println(windchill(32, 10));
    }

}
