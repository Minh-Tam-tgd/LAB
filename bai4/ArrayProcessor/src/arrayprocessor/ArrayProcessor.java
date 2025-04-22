package arrayprocessor;

import java.util.Scanner;

public class ArrayProcessor {
    /**
     * Tinh tong cac phan tu trong mang.
     * @param numbers mang so nguyen dau vao
     * @return tong cac phan tu, hoac 0 neu mang rong
     */
    public int calculateSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Mang dang trong.");
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Tinh gia tri trung binh cua cac phan tu trong mang.
     * @param numbers mang so nguyen dau vao
     * @return gia tri trung binh, hoac 0 neu mang rong
     */
    public double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Mang dang trong.");
            return 0;
        }
        int sum = calculateSum(numbers);
        return (double) sum / numbers.length;
    }

    /**
     * Hien thi tong va trung binh cua mang.
     * @param numbers mang so nguyen dau vao
     */
    public void displayResults(int[] numbers) {
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Trung binh cong: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayProcessor processor = new ArrayProcessor();

        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        processor.displayResults(numbers);
    }
}
