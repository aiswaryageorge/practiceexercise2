import java.util.Scanner;

public class Fact {

    static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Long Factorials : ");
        long n = sc.nextLong();

        for (long i = 0; i <= n; i++) {
            if (i <= 20) {
                System.out.println(" the factorial of " + i + " is " + factorial(i));
            } else {
                System.out.println("The factorial of " + i + " is out of range");
            }
        }
    }
}
