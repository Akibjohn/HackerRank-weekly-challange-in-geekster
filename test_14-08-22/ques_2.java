import java.util.*;

public class ques_2 {
    public static Scanner input = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;

    }

    public static void sumOfPrimeDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (isPrime(digit) == true) {
                sum += digit;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int n = input.nextInt();
        sumOfPrimeDigit(n);
    }

}
