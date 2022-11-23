import java.util.*;
/**
 * RandomNumber
 */
public class RandomNumber {

    public static void main(String[] args) {
        System.out.println("To generate Random Number\n");
        System.out.println("Using Math.random() function");
        double rand_double = Math.random();
        System.out.println(rand_double);
        System.out.println("\nUsing java.util.Random class\n");
        Random r = new Random();
        int rand_int = r.nextInt(1000);
        System.out.println("Random integer\n"+rand_int);
        double rand_double1 = r.nextDouble();
        System.out.println("\nRandom Double\n"+rand_double1);
    }
}