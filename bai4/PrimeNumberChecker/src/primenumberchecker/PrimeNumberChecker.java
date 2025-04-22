package primenumberchecker;

import java.util.Scanner;

public class PrimeNumberChecker {

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Kiem tra tu 2 den can bac hai cua num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Khong phai so nguyen to
            }
        }
        return true; // La so nguyen to
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumberChecker checker = new PrimeNumberChecker();

        System.out.print("Nhap mot so nguyen: ");
        int number = scanner.nextInt();

        if (checker.isPrime(number)) {
            System.out.println(number + " la so nguyen to.");
        } else {
            System.out.println(number + " khong phai la so nguyen to.");
        }
    }
}
