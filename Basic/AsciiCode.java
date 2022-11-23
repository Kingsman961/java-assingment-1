import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        System.out.println("Enter the Character to be converted into ASCII Code : ");
        ch = in.next().charAt(0);
        if (Character.isLetter(ch) == true) {
            if (Character.isUpperCase(ch)) {
                System.out.println("The ASCII code of " + ch + " is " + (int) ch);
            } else {
                System.out.println("The ASCII code of " + ch + " is " + (int) ch);
            }
        }
    }
}
