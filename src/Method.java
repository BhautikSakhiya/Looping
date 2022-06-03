// Ways to crate a method
// Use of static method
// Without static method and inside same class
// Without static method and inside another class

public class Method {

    //Use of static method
    static int add(int ...arr){     //(int ...arr)--> varArgs(variable argument)
        int sum = 0;
        for (int a : arr)
            sum += a;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum of 2,3,4,5 : "+add(2,3,4,5));
        System.out.println("sum of 2,3,4,5,6: "+add(2,3,4,5,6));
        System.out.println("sum of 2,3,4,5,6,7,8 : "+add(2,3,4,5,6,7,8));
    }



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
