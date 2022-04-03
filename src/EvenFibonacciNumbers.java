import java.util.Scanner;

public class EvenFibonacciNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SCANNER.nextInt();
        while (t-- > 0) {
            long n = SCANNER.nextLong();
            System.out.println(sumOfEvenFibonacci(n));
        }
    }

    private static long sumOfEvenFibonacci(long n) {
        long a = 1, b = 2, temp;
        long sum = 0;

        while (a < n) {
            if (a % 2 == 0) sum += a;
            temp = a;
            a = b;
            b += temp;
        }

        return sum;
    }
}
