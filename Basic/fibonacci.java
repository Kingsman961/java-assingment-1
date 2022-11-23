import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms of Fibonacci series to be displayed: ");
        int n = in.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till" + n + "terms:-");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + "  ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}