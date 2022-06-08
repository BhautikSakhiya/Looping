import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name:");
        String firstName = sc.nextLine();
        System.out.print("Enter Surname:");
        String surname = sc.nextLine();
        String fullName = firstName+" "+surname;
        System.out.println(fullName);   //CONCATENATION

//        for (char letter:fullName.toCharArray()) {
//            System.out.println(letter + " ");
//        }

//        for (int i = 0; i < fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }

        //COMPARE TWO STRING
        if (firstName.compareTo(surname)==0){       //CompareTO --> return 0 if string are matched, and if str1(letter)>str2(letter) return +ve
            System.out.println("String are matched");
        }else {
            System.out.println("String are not matched");
        }

    }
}
