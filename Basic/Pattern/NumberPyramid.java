import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = in.nextInt();
        for(int i = 1; i<=row; i++){
            System.out.println();
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
        }
    }
}
