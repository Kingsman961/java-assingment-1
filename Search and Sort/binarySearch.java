import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number elements to be in the list :- ");
        int l = in.nextInt();
        int[] a = new int[l];
        int i, j, t, lb = 0, ub, flag = 0, ns, mb = 0;
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
        System.out.println("\nEnter the number to be searched");
        ns = in.nextInt();
        ub = l;
        while (lb <= ub) {
            mb = (ub + lb) / 2;
            if (a[mb] < ns) {
                lb = mb + 1;
            }
            if (a[mb] > ns) {
                ub = mb - 1;
            }
            if (a[mb] == ns) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Number " + a[mb] + " found at index : " + (mb + 1));
        } else {
            System.out.println("Number not found");
        }
    }
}
