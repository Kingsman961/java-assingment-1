import java.util.Scanner;

public class TheHashAndDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = in.nextInt();
        for(int i = 1; i<=row; i++){
            System.out.println();
            for (int j = 1; j<=i; j++){
                if (j % 2 == 0){
                    System.out.print("$ ");
                }else{
                    System.out.print("# ");
                }
            }
        }
    }
}
