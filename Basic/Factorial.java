import java.util.*;

public class Factorial {
    int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the to find its factorial :- ");
        int num = in.nextInt();
        Factorial fact = new Factorial();
        System.out.println("The factorial of "+ num + " is = "+fact.factorial(num));
    }   
}