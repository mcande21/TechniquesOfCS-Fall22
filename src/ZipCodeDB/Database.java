package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Store data about all of the zipcodes.
 */
public class Database {

    private ArrayList<Zipcode> codes;

    public Database() {
        // allocate the array List
        codes = new ArrayList<>();
        this.load_zips();
    }

    // fill the zipcode array list with real data
    private void load_zips (){
        URL url = null; // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/zips.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // read zipcode file line by line
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String [] parts = line.split(",");
            Zipcode z = new Zipcode(
                    parts[1].substring(1, parts[1].length()-1),
                    parts[2].substring(1, parts[2].length()-1),
                    parts[3].substring(1, parts[3].length()-1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]),
                    Integer.parseInt(parts[6]));
        }

    }

}
