//  ABSTRACT CLASS -> DEFINE AND DECLARE
// INTERFACE-> ONLY DECLARE -> AFTER 1.8 DEFINE ALSO POSSIBLE
// IN INTERFACE public, static and final by default.



////  INTERFACE DEFINE AND OVERRIDDING
////  here we can't call interface A directly --> to call interface A, we require anonymous function...
//interface A{
//    void show();                        //DECLARE
//    default void overRide(){            //OVERRIDE -> AND DEFINE METHOD WITH ONLY DEFAULT ACCESS MODIFIER
//        System.out.println("In A");
//    }
//}
//class B implements A{
//    public void show(){
//        System.out.println("heyy");
//    }
//    public void overRide(){
//        System.out.println("In B");
//    }
//}
//public class Abstract {
//    public static void main(String[] args) {
//        A a = new B();
//        a.show();
//        a.overRide();
//    }
//}


    // USING STATIC KEYWORD WE CAN CALL DIRECTLY INTERFACE A
interface A{
    void show();                         //DECLARE
    static void demo(){           // USE DEFAULT KEYWORD INSTEAD OF STATIC FOR ANONYMOUS FUNCTION       //DECLARE AND DEFINE
        System.out.println("In A");
    }
}
public class Abstract {
    public static void main(String[] args) {
        A.demo();
//        A a = new A() {
//            @Override
//            public void show() {
//                System.out.println("calling show");
//            }
//        };
//        a.show();
//        a.demo();
    }
}


//class PrintNumber{
//    void printNumber(Number n){       // Number has ann abstract class from which Integer, DOuble and Float are extends.
//        System.out.println(n);
//    }
//}
//public class Abstact {
//    public static void main(String[] args) {
//        PrintNumber no = new PrintNumber();
//        no.printNumber(5.9);
//        no.printNumber(7);
//        no.printNumber(7.5f);
//    }
//}


//    //ANONYMOUS CLASS ==> PURPOSE IS TO OVERRIDE THE CLASS A
//class  A{
//    void show(){
//        System.out.println("In A class..");
//    }
//}
//public class Abstract {
//    public static void main(String[] args) {
//        A a = new A(){                                  //ANONYMOUS CLASS,  ALSO CAN CREATE OBJECT OF INTERFACE CLASS
//                        public void show(){
//                            System.out.println("Override A class ");
//                        }
//                    };
//        a.show();
//    }
//}


//  //ANONYMOUS CLASS ==> USING INTERFACE -->PURPOSE IS TO OVERRIDE THE CLASS A
//
//interface A{
//    void show();
//}
//public class Abstract{
//    public static void main(String[] args) {
//        A a = new A(){
//            public void show(){
//                System.out.println("In anonymous class");
//            }
//        };
//        a.show();
//    }
//}


//
//        //LAMBDA EXPRESSION
//interface A{
//    void show();
//}
//public class Abstract {
//    public static void main(String[] args) {
//        A a = () -> System.out.println("use of lambda expression..");
//        a.show();
//    }
//}


//public abstract class Message {
//    public String recipient;
//    public abstract void sendMessage();
//    public static void main(String[] args) {
//        Message m = new TextMessage();
//        m.recipient = "1234567890";
//        m.sendMessage();
//    }
//    static class TextMessage extends Message {
//        public final void sendMessage() {
//            System.out.println("Text message to " + recipient);
//        } } }
