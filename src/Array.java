import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // THRERE WAYS TO CRETE ARRAYS

//        int[] marks = new int[5];   // 1.DECLARE AND MEMORY ALLOCATION
//        marks[0] = 82;
//        marks[1] = 92;
//        marks[2] = 99;
//        marks[3] = 89;
//        marks[4] = 52;
//
//        for(int element:marks) {    // FOR-EACH LOOP
//            System.out.println(element);
//        }

//        int[] mark = {4,3,5,3};   // 2. DECLARE AND INITIALIZE

//        int[] mark3;  // 3. ONLY DECLARE THEN INITIALIZE

//        // SUM OF FIVE NO. IN ARRAY
//        int[] number = {31,44,34,57,67};
//        int sum = 0;
//        for (int element:number) {
//            sum += element;
//        }
//
//        double avarage = (double)(sum/5);
//        System.out.println(sum);
//        System.out.println(avarage);


//        // FIND GIVEN NO. IS IN ARRAY PR NOT
//        int[] no = {4,5,6,7,8,9,0,2,22,11,33,44,55,33,12,13,15,20,21,19};
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean IsAnArray = false;
//        for (int ele:no) {
//            if(ele == n){
//                IsAnArray = true;
//                break;
//            }
//        }
//        if (IsAnArray){
//            System.out.println("your number is matched with array");
//        }else {
//            System.out.println("your number is not matched with array");
//        }


//        //SUM OF MATRIX
//        int [][] matrix1= {{2,4,7},{7,8,6}};
//        int [][] marrix2= {{9,5,3},{2,3,1}};
//        int [][] result = {{0,0,0},{0,0,0}};
//
//        for (int i = 0; i < matrix1.length; i++){
//            for (int j = 0; j < matrix1[i].length; j++){   //FOR ROW
//                result[i][j]=matrix1[i][j] + marrix2[i][j];    //FOR COLUMN
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

//        //REVERSE ARRAY
//        int[] n = {2,4,5,2,3,5,6,1};
//        int l = n.length;
//        int half = l/2;
//        for (int i = 0; i < half; i++){
//            int temp = n[i];
//            n[i] = n[l-i-1];
//            n[l-i-1] = temp;
//        }
//        for (int element:n) {
//            System.out.print(element);
//        }

//        // MAX NUMBER FROM ARRAY
//        int[] arr = {2,4,5,2,3,5,6,1,9};
//        int max = 0;
//        for (int i : arr){
//            if(i > max){
//                max = i;
//            }
//
//        }
//        System.out.println(max);



        //REVERSE ARRAY USING METHOD
        Integer[] arr = {1,54,3,54,6,88,3030,300,57};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf("%s",Arrays.toString(arr));


//        // SHORT ARRAY
//        int[] arr = {2, 4, 5, 2, 3, 5, 6, 1, 9};
//        int temp = 0;
////        boolean IsShorted = true;
//        int i;
//        for (i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.print(arr[i] + " ");
//        }
////        for (int e:arr) {
////        System.out.print(e + " ");
////        }


//        // Custom input array shorting using sort() method.
//        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
//        Arrays.sort(arr);
//        System.out.printf("Modified arr[] : %s",Arrays.toString(arr));


    }
}
