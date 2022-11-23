import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        boolean notPrime = false;
        int num = in.nextInt();
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                notPrime = true;
                break;
            }
        }
        if (!notPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
