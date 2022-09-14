import java.util.Scanner;

import static java.lang.Math.pow;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    private static Scanner sc;
    public static int squared(int i) {
        return i * i;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        int i;
        sc = new Scanner(System.in);

        System.out.print("Please Enter any Number: ");
        i = sc.nextInt();

        // Modify the below call to assign the result of the method call to a variable.
        int squared = squared(i);

        // Put the result System.out code here.
        System.out.println("\n The square of " + i + " is " + squared + ".");
    }
}
