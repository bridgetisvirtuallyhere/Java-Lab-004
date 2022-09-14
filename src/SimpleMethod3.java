import java.util.Scanner;
import java.math.*;
public class SimpleMethod3 {

    /*
    NOTE: You can create multiple methods with the same name and different return
          types or parameters (Overloading methods).
          Overloaded methods can even call each-other, but you'll have to type
          the arguments correctly and cast upon return.
     */
    public static int square(int input) {
        // Put your code here
        return (int) Math.pow(input, 2);
    }

    public static double square(double input2) {
        // Put your code here
        return Math.pow(input2, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to square: ");
        /* Doubles used  */
        double input2 = Double.parseDouble(scanner.nextLine());
        System.out.printf("The square of %f is %f%n", input2, square(input2));

        System.out.print("What number would you like to square: ");
        /* Integers Used */
        int input = Integer.valueOf(scanner.nextLine());
        System.out.printf("The square of %d is %d%n", input, square(input));
    }
}