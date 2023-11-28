import java.text.DecimalFormat;
import java.util.Scanner;

public class Chapter_1_08 {
    public static void main(String[] args) {
        int total; // sum of score
        int Max; // number of scores entered
        int score; // score value
        double average; // number with decimal point for average
        Scanner scan = new Scanner(System.in);
        total = 0; // initialize total
        System.out.print("Enter number of score : ");
        Max = scan.nextInt();
        for (int n = 1; n <= Max; n++) {
            System.out.print("Enter Integer Score " + n + " : ");
            score = scan.nextInt();
            total = total + score; // add score to total
        }
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        average = (double) total / Max;
        System.out.println("Class average is " + twoDigits.format(average));
    }
}
