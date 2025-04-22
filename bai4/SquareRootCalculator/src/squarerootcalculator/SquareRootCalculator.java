package squarerootcalculator;

import java.util.Scanner;

public class SquareRootCalculator {

    public double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Không thể tính căn bậc hai của số âm.");
        }
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SquareRootCalculator calculator = new SquareRootCalculator();

    System.out.print("Nhap mot so: ");
    double number = scanner.nextDouble();

    double result = calculator.calculateSquareRoot(number);
    System.out.println("Can bac hai: " + result);
}

}
