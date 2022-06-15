//   SIZE IS NOT FIXED -> COMPARE TO ARRAY
//          Collection  --> Interface
//                |     Extends
  //              V
//                List    --> Interface
//                |     Implements
//                V
//            ArrayList   --> Class

//      GENERICS USED FOR SAME TYPE OF DATATYPE --> EX. ALL THE VALUES ARE INT


//enum Animals{
//    DOG("woof"), CAT("meow"), FISH("burble");
//    String sound;
//    Animals(String s){
//        sound = s;
//    }
//}
class Top{
    public Top(){
        System.out.println("B");
    }
}
public class Tablet extends Top{

    public Tablet(String s){
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Tablet("c");
        System.out.println(" ");
    }
}
//interface  Gadget {
//    void doStuff();
//}
//abstract class Electronic {
//     void getPower() {
//        System.out.print("plug in");
//    }
//}
//public class Tablet extends Electronic implements Gadget{
//    @Override
//    public void doStuff() {
//        System.out.println(" show");
//    }
//
//    public static void main(String[] args) {
//        new Tablet().getPower();
//        new Tablet().doStuff();
//    }
//}


//class Zoo{
//    public String coolMethod(){
//        return "wow";
//    }
//}
//public class Collections extends Zoo{
////    public static void main(String[] args) {
////
////    }
//    public void useMyCoolMethod(){
//        System.out.println("says"+ this.coolMethod());
//
//
//        Zoo z = new Zoo();
//        System.out.println("zoo says"+ z.coolMethod());
//    }


//    static Animals a;
//    public static void main(String[] args) {
//        System.out.println(a.DOG.sound + " "+ a.FISH.sound);
//
//    }

