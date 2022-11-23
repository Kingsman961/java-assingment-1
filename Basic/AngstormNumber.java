import java.util.Scanner;

public class AngstormNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Number :- ");
            int q, r, s = 0;
            int num = in.nextInt();
            while (num != 0) {
                r = num % 10;
                q = num / 10;
                num = q;
                System.out.println(r);
                s += Math.pow(r, 3);
            }
            System.out.println(s);
            if (s == 153) {
                System.out.println("The given Number is Angstorm Number.");
            } else {
                System.out.println("The given Number is not a Angstorm Number.");
            }
        }
    }
}
