package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections {

    static List something = list_stuff();


    private static List list_stuff() {

        List a = new ArrayList();
        return a;
    }


    public static void main(String[] args) {

        // Practice with Collections.

        List b = something;
        b.add("Hello");
        b.add(3);
        b.add(2.1);

        System.out.println(b);

        b.remove(1);
        System.out.println(b);
        // End simple Array practice.

        // Dictionary/Map practice.
        HashMap< String, Integer> hmap = new HashMap<String, Integer>();
        System.out.println(hmap);

        hmap.put("Cheese", 2);
        hmap.put("Bread", 1);
        System.out.println(hmap);



    }
}
