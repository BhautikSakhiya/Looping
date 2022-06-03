import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        int paperMark;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int marksOutOf = sc.nextInt();
        int totalPaper = sc.nextInt();

        for(int i = 1; i<=totalPaper; i++) {
            System.out.print(i+" paper mark :");
            paperMark = sc.nextInt();
            total += paperMark;
        }
        System.out.println("Total mark: " +total);
        System.out.println(marksOutOf*totalPaper);
        double percentage = (double)((total*100)/(marksOutOf*totalPaper));
        System.out.println("You get a " + percentage + "Percentage.");
    }
}

