package ZipCodeDB;

public class Main {
    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY", "Canton", 75.16,
                                           44.59, 11781);
        Zipcode z2 = new Zipcode("12409", "NY", "Woodstock", 74, 42, 5793);

        System.out.println(z1);
        System.out.println(z2);

        Database db = new Database();


    }
}
