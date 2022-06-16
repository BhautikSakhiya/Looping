package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(4);
        values.add(75);
        values.add(27);
        values.add(1);
        values.add(13);
        Collections.sort(values);
        for (int e:values) {
            System.out.println(e);
        }


        List<Number> value = new ArrayList<>();
        value.add(7);
        value.add(4.0);
        value.add(75);
        value.add(27);
        value.add(1.55f);
        value.add(13.8);
        value.forEach(System.out::println);
    }
}
