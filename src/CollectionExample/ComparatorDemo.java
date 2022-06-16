package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(700);
        values.add(456);
        values.add(759);
        values.add(270);


        Comparator<Integer> com = (o1,o2) ->{
            return o1%10>02%10?1:-1;
        };
        Collections.sort(values,com);

        for (Integer in :values) {
            System.out.println(in);
        }
    }
}
