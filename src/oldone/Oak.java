package oldone;

import java.util.ArrayList;
import java.util.Collections;

public class Oak {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars, (a,b)->b.charAt(0) - a.charAt(0));  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
