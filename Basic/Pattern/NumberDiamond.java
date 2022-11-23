import java.util.*;

public class NumberDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d=1,i,j,k,p;
        System.out.println("Enter the number of Rows : ");
        int line = in.nextInt();
        p=line;
        for (i=1;i<=line;i++){
            for (j=1; j<=p;j++)
                System.out.print(j);
            for (k=1; k<=d; k++)
                System.out.print(" ");
            for (k=p; k>=1;k--)
                System.out.print(k);
            System.out.println();
            d+=2;
            p-=1;
        }
        int d1=1;
        for (i = 1; i<=line; i++){
            for (j=1;j<=i;j++)
                System.out.print(j);
            //System.out.print(" d1= "+d1);
            for (k=line+(line-1); k>=d1; k--)
                System.out.print(" ");
            for (k=i;k>=1;k--)
                System.out.print(k);
            System.out.println();
            d1=d1+2;
        }
    }
}