// Ways to crate a method
// Use of static method
// Without static method and inside same class
// Without static method and inside another class

import java.util.Scanner;

public class Method {

//
//        public void doS(){
//            System.out.println("do Something");
//        }
//
//        public static void main(String[] arg){
//            new Method().doS();
//        }



//    //STATIC KEYWORD

//        int id;
//        int number;
//        static String clg;
//
//        static {  //FOR INITIALIZING STATIC VARIABLE AND IT EXECUTE WHEN LOAD THE CLASS. AND IT ONLY LOAD ONCE.
//            clg = "ldrp";
//        }
//
//        public Method(){    //FOR INITIALIZING NON-STATIC VARIABLE AND IT EXECUTE WHEN CREATE AN OBJECT.
//            id = 01;
//            number = 99999;
////            clg = "ldrp";
//        }
//
//        public void show(){
//            System.out.println("id: "+ id + " number: "+ number + " clg: "+clg);
//        }
//
//    public static void main(String[] args) {
//        Method me = new Method();
//        me.id = 06;
//        me.number = 63511;
//        Method.clg = "ldrp";    // FOR STATIC VARIABLE USE Method.
//
//        Method ram = new Method();
//
//        Method vvs = new Method();
//        vvs.id = 05;
//        vvs.number = 89798;
//
//        me.show();
//        ram.show();
//        vvs.show();
//    }

//    //CONSTRUCTOR and USE OF THIS KEYWORD
//
//    int a;
//    int b;
//
//    Method(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    Method(){
//        a = 3;
//        b = 5;
//    }
//
//    public static void main(String[] args) {
//        Method obj = new Method(5 ,5);
//        Method obj2 = new Method();
//        System.out.println(obj.b);
//        System.out.println(obj.a);
//        System.out.println(obj2.a + obj2.b);
//
//    }


//    //FACTORIAL USING RECURSION

//    static int factorial(int n){
//        if(n == 1){
//            return 1;
//        }else {
//            return n * factorial(n - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//
//    }


//    // FIBONACCI SERIES

//    public static void fibonacci(int n){
//        int a = 0, b = 1, temp;
//        System.out.println(a);
//        for(int i = 2; i <= n; i++){
//            System.out.println(b+" ");
//            temp = b;
//            b = a + b;
//            a = temp;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        fibonacci(n);
//
//    }


//    // GREATER NUMBER AMONG TWO

//    static int greaterNumber(int num1, int num2){
//        if (num1>num2){
//            return num1;
//        }else {
//            return num2;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(greaterNumber(num1,num2));
//    }


//    // FACTORIAL NUMBER

//    public static void factorialNumber(int n) {
//
//        int factorial = 1;
//        for (int i = n; i >= 1; i--) {
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        factorialNumber(n);
//    }


//    //USE OF STATIC KEYWORD

//    static int add(int ...arr){     //(int ...arr)--> varArgs(variable argument)
//        int sum = 0;
//        for (int a : arr)
//            sum += a;
//        return sum;
//    }
//    public static void main(String[] args) {
//        System.out.println("sum of 2,3,4,5 : "+add(2,3,4,5));
//        System.out.println("sum of 2,3,4,5,6: "+add(2,3,4,5,6));
//        System.out.println("sum of 2,3,4,5,6,7,8 : "+add(2,3,4,5,6,7,8));
//    }


//    // Without static method and inside same class

//    int sum;
//    int add(int a,int b){
//        sum = a + b;
//        return  sum;
//    }
//    public static void main(String[] args) {
//        Method obj = new Method();
//        System.out.println("The sum is: "+obj.add(2,3));
//    }


}
