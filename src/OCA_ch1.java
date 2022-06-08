class  Rocket{
     void blastOff(){
        System.out.println("bang");
    }
}
public class OCA_ch1 extends Rocket{
    public static void main(String[] args) {
//          go();
        new OCA_ch1().go();
    }
    void go(){
        blastOff();
        new Rocket().blastOff();
    }
    void blastOff(){
        System.out.println("sh-bang.");
    }

}
