package CollectionExample;
import java.util.Comparator;
import java.util.Objects;

    public class Student implements Comparable<Student> {

        String name;
        int rollNo;

        public Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {      //IT WILL CONVERT HASHCODE INTO STRING AND RETURN STRING OF STUDENT IN SetDemo Class.
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }

        @Override
        // WITHOUT USE OF THIS CODE SET CAN'T DIFFERENTIATE DUPLICATE ELEMENT IN STUDENT OBJECT IN SetDemo Class..
        public boolean equals(Object o) {           // IT WILL CHECK DUPLICATE ELEMENT(ROLL NO.) IN ALL OBJECT OF STUDENT.
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return rollNo == student.rollNo;
        }

        @Override
        public int hashCode() {
            return Objects.hash(rollNo);
        }

        @Override
        public int compareTo(Student that) {
            return this.rollNo - that.rollNo;
        }

  /*      public int compareTo(Student person) {        // FOR STRING COMPARISON
            return name.compareTo(person.name);
        }*/

    }