package ZipCodeDB;

/*
 * Hold data about one zipcode
 */
public class Zipcode {
    private String code;
    private String state; // two character code abbreviation
    private String city;
    private double longitude;
    private double latitude;
    private int population;

    public Zipcode(String code, String state, String city, double longitude, double latitude, int population) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
        this.population = population;
    }

    public String toString() {
        return "Zipcode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", population=" + population +
                '}';
    }
}

