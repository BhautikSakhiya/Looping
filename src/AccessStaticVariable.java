////STATIC METHOD CANNOT ACCESS AN INSTANCE(NON STATIC) VARIABLE AND INSTANCE(NON STATIC) METHOD
////STATIC METHOD CAN'T OVERRIDE BUT REDEFINED
//
//
//class Frog{
//    public static int a = 0;
//
//    Frog(){
//        a += 1;
//    }
//
//    static int getA(){
//        return a;
//    }
//}
//public class AccessStaticVariable {
//    public static void main(String[] args) {
//        new Frog();
//        new Frog();
//        new Frog();
//        System.out.println("from static:" + Frog.getA());       //USING STATIC CONTEXT
//        new Frog();
//        new Frog();
//
//        new AccessStaticVariable().go();
//        Frog aa = new Frog();
//        System.out.println("use reference var:"+aa.getA());     //USING REFERENCE VAR
//
//    }
//    void go(){
//            System.out.println("from instance context:"+ Frog.getA());      //USING INSTANCE CONTEXT
//        }
//
//}
interface Ii1 {
    default int doStuff() {
        return 1;
    }
}
interface Ii2 {
    default int doStuff() {
        return 2;
    }
}
public class AccessStaticVariable implements Ii1,Ii2 {
    public static void main(String[] args) {
        new AccessStaticVariable().go();
    }
    void go(){
        System.out.println(doStuff());
    }
    public int doStuff(){
        return 3;
    }
}
