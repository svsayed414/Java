
import java.util.Scanner;

public class HalveIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double res = scan.nextDouble();
        System.out.printf("%.2f", halveTheNumber(res));
    }

    public static double halveTheNumber(double num) {
        return num/2.0;
    }
}
