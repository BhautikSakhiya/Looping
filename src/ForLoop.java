import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();

        }


//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                if((i+j)%2 == 0){
//                    System.out.print("1 ");
//                }else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }


//        int n = sc.nextInt();
//        int count = 0;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j<=i; j++){
//                count += 1;
//                System.out.print(count + " ");
//            }
//            System.out.println();
//        }


//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++ ){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }


//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= m; j++){
//                if (i == 1 || j == 1 || i == n || j == m){
//                    System.out.print("#");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 10; i++ ){
//            System.out.println(i);
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(n + "x" + i + "=" + n*i);
//        }


//        int i = 1;
//        int sum = 0;
//        while (i <= n){
//            sum += i;
//            System.out.println(sum);
//            i++;
//        }
//        System.out.println("Sum of n number is:" + sum);


    }
}
