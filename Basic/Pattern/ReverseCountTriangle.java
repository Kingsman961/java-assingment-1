import java.util.Scanner;

public class ReverseCountTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = in.nextInt();
            for (int i = row; i>=1; i--){
            System.out.println();
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
        }
    }
}
