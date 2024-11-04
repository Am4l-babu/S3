import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("There are no prime numbers less than 2.");
        } else {
            System.out.println("Prime numbers up to " + number + " are:");
            for (int i = 2; i <= number; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // No other even number can be prime
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
