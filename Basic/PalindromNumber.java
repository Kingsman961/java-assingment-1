import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int q, r, s = 0;
        int num = in.nextInt();
        int p = num;
        while (num != 0) {
            r = num % 10;
            q = num / 10;
            num = q;
            System.out.println(r);
            s = s * 10 + r;
        }
        System.out.println(s);
        if (p == s) {
            System.out.println("The given number is Palindrom.");
        } else {
            System.out.println("The given number is not Palindrom.");
        }
    }
}
