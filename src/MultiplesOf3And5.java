import java.util.Scanner;

public class MultiplesOf3And5 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int t = SCANNER.nextInt();
        while (t-- > 0) {
            long n = SCANNER.nextInt();
            long result = summation_n((n - 1) / 3) * 3 + summation_n((n - 1) / 5) * 5 - summation_n((n - 1) / 15) * 15;
            System.out.println(result);
        }
    }

    private static long summation_n(long x) {
        return (x * (x + 1)) / 2;
    }
}
