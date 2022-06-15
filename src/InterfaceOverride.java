interface I1{
    static void in(){
        System.out.println("i1");
    }
}
interface I2{
    default void in(){
        System.out.println("i2");
    }
}
public class InterfaceOverride implements I1, I2 {
    public static void main(String[] args) {
        InterfaceOverride i = new InterfaceOverride();
        i.in();
    }

        public void in () {
            System.out.println("i3");
            I1.in();        //  TO CALL OVERRIDE METHOD ==> USE SUPER KEYWORD --> i1.super.in();  OR  MAKE A METHOD STATIC OF INTERFACE I1.
        }

}
