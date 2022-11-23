import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the max number : ");
        int maxNumber = in.nextInt();
        for (int num = 1; num <= maxNumber; num++) {
            boolean isPrime = true;
            for (int j = 2; j <= num / 2; ++j) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + "\t");
            }
        }
    }
}
