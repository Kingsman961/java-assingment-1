import java.util.Scanner;

public class ReverseStarPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int row = in.nextInt();
        for (int i = 1; i<=row; i++){
            System.out.println();
            for(int j = row; j>=i; j--){
                System.out.print("* ");
            }
        }
    }
}
