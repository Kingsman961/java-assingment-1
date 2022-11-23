import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number elements to be in the list :- ");
        int l = in.nextInt();
        int[] a = new int[l];
        int i, j, t;
        System.out.println("Enter the numbers :- ");
        for (i = 0; i < l; i++) {
            a[i] = in.nextInt();
        }
        for (i = 0; i < l; i++) {
            for (j = i + 1; j < l; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            System.out.print(a[i] + " ");
        }

    }
}
