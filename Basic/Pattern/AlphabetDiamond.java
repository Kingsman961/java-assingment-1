import java.util.Scanner;

public class AlphabetDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d=1,i,j,k,p;//i for lines,j for print, k for space
        System.out.println("Enter the number of Rows : ");
        int line = in.nextInt();
        p=line;
        for (i=1;i<=line;i++){
            System.out.println();
            for (j=1;j<=p;j++)
                System.out.print((char)(j+64));
            for (k=1;k<=d;k++)
                System.out.print(" ");
            for (j=p;j>=1;j--)
                System.out.print((char)(j+64));
            d+=2;
            p-=1;
        }
        int d1=1;
        for (i = 1; i<=line; i++){
            System.out.println();
            for (j=1;j<=i;j++)
                System.out.print((char) (j+64));
            for (k=line+(line-1); k>=d1; k--)
                System.out.print(" ");
            for (j=i;j>=1;j--)
                System.out.print((char) (j+64));
            d1=d1+2;
        }
    }
}
