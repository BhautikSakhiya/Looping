//Encapsulation --> Bind data with method

class Student{

//    public  int rollNo;
//    public String name;
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

//        Student s = new Student();
//        s.setRollNo(2);       // SET THE VALUE
//        s.setName("Auyy");        // SET THE VALUE.(SETTER)
//
//        System.out.println(s.getRollNo());       //GET THE VALUES(GETTER)
//        System.out.println(s.getName());         //GET THE VALUES

//        new Student().setRollNo(1);           //1 ways to set and get values
//        new Student().setName("Bhautik");

        Student s = new Student();
        s.setName("Bhautik");
        s.setRollNo(1);
        System.out.println(s.getName());
        System.out.println(s.getRollNo());

    }
}
