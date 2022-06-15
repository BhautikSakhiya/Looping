public class Recursion {
    static int a = 0, b = 1, c = 0;
    static void recursion(int count){
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            recursion(count - 1);       //HERE FUNCTION CALL ITSELF.
        }
    }
    public static void main(String[] args) {
        int count = 15;
        System.out.print(a + " "+ b + " ");
        recursion(count - 2);

    }
}
