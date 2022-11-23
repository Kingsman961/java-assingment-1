import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Rows : ");
        int lines = in.nextInt();
        for (int i = 1; i<=lines; i++){
            System.out.println();
            for (int j=i; j>=1; j--)
                System.out.print("\t"+(char)(j+64));
        }
    }
}
