import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = in.nextInt();
        for (int i = 1; i <= row; i++){
            System.out.println();
            for (int k = row; k >= i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        }
    }
}
