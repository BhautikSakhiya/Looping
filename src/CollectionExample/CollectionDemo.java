package CollectionExample;

// Collection is an interface
// Collections is a class

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        // IT SUPPORT ALL TYPES OF DATA TYPES BECAUSE OBJECT IS CREATED
        // COLLECTION
        Collection values = new ArrayList();
        values.add(3);
        values.add("Name");
        values.add(2.4);

        values.forEach(System.out::println);

//        for (Object i:values) {
//            System.out.println(i);
//        }


        // IT SUPPORT ONLY INT DATA TYPE
        // GENERICS
        Collection<Integer> value = new ArrayList();
        value.add(3);
//        value.add("Name");
        value.add(2);
        value.add(999999);

        for (Object i:value) {      //--> INTEGER AND int CAN BE USED INSTEAD OF Object. IN LOOP
            System.out.println(i);
        }
    }
}


// DISADVANTAGE:-
//  CAN'T SORT
//  DON'T ADD ELEMENT IN BETWEEN
//   AND FOR THAT USE LIST.