import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Java program to create matrix of any valid order
        // Matrix 1
        System.out.println("Enter number of rows of Matrix 1:- ");
        int rows1 = in.nextInt();
        System.out.println("Enter number of columns of Matrix 1:- ");
        int columns1 = in.nextInt();
        int[][] Matrix1 = new int[rows1][columns1];
        System.out.println("Enter the values in Matrix 1 :- ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                Matrix1[i][j] = in.nextInt();
            }
        }

        // displaying Matrix 1
        System.out.println("\nMatrix 1:-");
        for (int i = 0; i < rows1; i++) {
            System.out.println();
            for (int j = 0; j < columns1; j++) {
                System.out.print(Matrix1[i][j] + "\t");
            }
        }

        // Matrix 2
        System.out.println("\n\nEnter number of rows of Matrix 2:- ");
        int rows2 = in.nextInt();
        System.out.println("Enter number of columns of Matrix 2:- ");
        int columns2 = in.nextInt();
        int[][] Matrix2 = new int[rows2][columns2];
        System.out.println("Enter the values in Matrix 2 :- ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                Matrix2[i][j] = in.nextInt();
            }
        }
        // displaying Matrix 2
        System.out.println("\nMatrix 2:-");
        for (int i = 0; i < rows2; i++) {
            System.out.println();
            for (int j = 0; j < columns2; j++) {
                System.out.print(Matrix2[i][j] + "\t");
            }
        }

        // Java program to add two matrices
        if (rows1 == rows2 && columns1 == columns2) {
            int[][] sumMat = new int[rows1][columns1];
            System.out.println("\n\nThe sum of the above two matrices is:-");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    sumMat[i][j] = Matrix1[i][j] + Matrix2[i][j];
                }
            }
            for (int i = 0; i < rows1; i++) {
                System.out.println();
                for (int j = 0; j < columns1; j++) {
                    System.out.print(sumMat[i][j] + "\t");
                }
            }
        }

        // Java program to subtract two matrices
        if (rows1 == rows2 && columns1 == columns2) {
            int[][] diffMat = new int[rows1][columns1];
            System.out.println("\n\nThe diff of the above two matrices is:- ");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    diffMat[i][j] = Matrix1[i][j] - Matrix2[i][j];
                }
            }
            for (int i = 0; i < rows1; i++) {
                System.out.println();
                for (int j = 0; j < columns1; j++) {
                    System.out.print(diffMat[i][j] + "\t");
                }
            }
        }

        // Java program to multiply two Matrices
        if (columns1 == rows2) {
            int[][] product = new int[rows1][columns2];
            System.out.println("\n\nThe product of above two Matrices:- ");

            for (int i = 0; i < rows1; i++) {
                System.out.println();
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        product[i][j] += Matrix1[i][k] * Matrix2[k][j];
                    }
                    System.out.print(product[i][j] + "\t");
                }
            }
        }

        // java program to determine whether two matrices are equal
        boolean flag = false;
        if (rows1 == rows2 && columns1 == columns2) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    if (Matrix1[i][j] == Matrix2[i][j]) {
                        flag = true;
                        break;
                    }
                }
            }
        } else {
            System.out.println("\n\nThe given two Matrices are not equal");
        }

        if (flag) {
            System.out.println("\n\nThe given two Matrices are Equal");
        } else {
            System.out.println("\n\nThe given two Matrices are not equal");
        }

        // program to display lower triangular matrix
        if (rows1 != columns1) {
            System.out.println("Matrix should be a Square Matrix");
        } else {
            int[][] ltm = new int[rows1][columns1];
            System.out.println("\nThe Lower Triangular Matrix");
            for (int i = 0; i < rows1; i++) {
                System.out.println();
                for (int j = 0; j < columns1; j++) {
                    ltm[i][j] = Matrix1[i][j];
                    if (j > i) {
                        ltm[i][j] = 0;
                    }
                    System.out.print(ltm[i][j] + "\t");
                }
            }
        }

        // program to display upper triangular matrix
        if (rows2 != columns2) {
            System.out.println("\n\nMatrix should be a Square Matrix");
        } else {
            int[][] utm = new int[rows2][columns2];
            System.out.println("\n\nThe Upper Triangular Matrix");
            for (int i = 0; i < rows2; i++) {
                System.out.println();
                for (int j = 0; j < columns2; j++) {
                    utm[i][j] = Matrix2[i][j];
                    if (j < i) {
                        utm[i][j] = 0;
                    }
                    System.out.print(utm[i][j] + "\t");
                }
            }
        }

        // program to find the frequency of odd and even numbers in given matrix
        int countEven = 0, countOdd = 0;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                if (Matrix1[i][j] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }
        System.out.println(
                "\n\nEven numbers in Matrix 1 are = " + countEven + "\n\nOdd numbers in Matrix 1 are = " + countOdd);

        // Program to find the sum of each row and each column of a matrix 1
        int r, c;
        System.out.println("\n\nSum of Rows of Matrix 1 are :- ");
        for (int i = 0; i < rows1; i++) {
            r = 0;
            for (int j = 0; j < columns1; j++) {
                r += Matrix1[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + r);
        }
        System.out.println("\n\nSum of Columns of Matrix 1 are :- ");
        for (int i = 0; i < rows1; i++) {
            c = 0;
            for (int j = 0; j < columns1; j++) {
                c += Matrix1[j][i];
            }
            System.out.println("Column " + (i + 1) + " = " + c);
        }

        // Program to find transpose of a Matrix
        int[][] transpose = new int[rows1][columns1];
        System.out.println("\n\nThe transpose of Matrix 1 is :- ");
        for (int i = 0; i < rows1; i++) {
            System.out.println();
            for (int j = 0; j < columns1; j++) {
                transpose[i][j] = Matrix1[j][i];
                System.out.print(transpose[i][j] + "\t");
            }
        }

        // Program to check if the given Matrix is identity Matrix
        boolean f = false;
        int[][] identity = new int[rows1][columns1];
        if (rows1 == columns1) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    identity[i][j] = Matrix1[i][j];
                    if (i == j && identity[i][j] == 1) {
                        f = true;
                        break;
                    }
                }
            }
        } else {
            System.out.println("\n\nThe given Matrix is not square matrix");
        }
        if (f) {
            System.out.println("\n\nThe Identity Matrix :- ");
            for (int i = 0; i < rows1; i++) {
                System.out.println();
                for (int j = 0; j < columns1; j++) {
                    System.out.print(identity[i][j] + "\t");
                }
            }
            System.out.println("\n\nThe given Matrix is Identity Matrix");
        } else {
            System.out.println("\n\nThe given Matrix is not Indentity Matrix");
        }

        // Program to check if the given matrix is a sparse matrix
        int[][] sparse = new int[rows1][columns1];
        int size = rows1 * columns1;
        int countZeros = 0;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                sparse[i][j] = Matrix1[i][j];
                if (sparse[i][j] == 0) {
                    countZeros++;
                }
            }
        }
        if (countZeros > (size / 2)) {
            System.out.println("\n\nThe Sparse Matrix :- ");
            for (int i = 0; i < rows1; i++) {
                System.out.println();
                for (int j = 0; j < columns1; j++) {
                    System.out.print(sparse[i][j] + "\t");
                }
            }
            System.out.println("\n\nThe given Matrix is sparse Matrix");
        } else {
            System.out.println("\n\nThe given Matrix is not sparse Matrix");
        }
    }
}