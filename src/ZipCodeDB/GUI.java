package ZipCodeDB;
import javax.swing.*;
public class GUI {
        public static void main(String[] args) {
            JFrame frame = new JFrame("CS219 Weather App");
            frame.add(new GUIPanel());
            frame.setVisible(true);

            // When the
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.pack();
        }
    }

