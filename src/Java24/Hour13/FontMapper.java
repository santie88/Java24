package Java24.Hour13;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FontMapper {

    public static void main(String[] arguments) {
        new FontMapper();
    }

    public FontMapper() {
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        HashMap<String, Font> fonts = new HashMap<>();
        fonts.put("smallprint", courier);
        fonts.put("body", times);
        fonts.put("headline", verdana);

        //Looping through a map can be performed by using an entry set, a collection of all the entries in
        //the map. The entrySet() method returns these entries as a Set object (using the Set interface in java.util).
        for (Map.Entry<String, Font> entry : fonts.entrySet()) {
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + "-pt "
                    + value.getFontName());
        }
    }
}
