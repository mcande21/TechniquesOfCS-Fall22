package ZipCodeDB;

public class WeatherObservation {

    private double humidity;
    private double windspeed;
    private double temperature;
    private String coulds;

    public WeatherObservation(double humidity, double windspeed, double temperature, String coulds) {
        this.humidity = humidity;
        this.windspeed = windspeed;
        this.temperature = temperature;
        this.coulds = coulds;
    }

    @Override
    public String toString() {
        return "WeatherObservation{" +
                "humidity=" + humidity +
                ", windspeed=" + windspeed +
                ", temperature=" + temperature +
                ", coulds='" + coulds + '\'' +
                '}';
    }
}
