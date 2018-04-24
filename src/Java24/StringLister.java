package Java24;

import java.util.ArrayList;
import java.util.Collections;

public class StringLister {

    public static void main(String[] args) {
        String[] arr = {"Josep", "Larry", "Jane"};
        StringLister sl = new StringLister(arr);
    }

    String[] names = { "Carly", "Sam", "Kiki", "Lulu",
            "Hayden", "Elizabeth", "Kristina", "Molly", "Laura" };

    public StringLister(String[] moreNames) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);
        }
        for (int i = 0; i < moreNames.length; i++) {
            list.add(moreNames[i]);
        }
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}
