public class SimpleMethod {
    // Put your method code here

    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);

        int i = 25;
        int square = square(25);
        System.out.println("\n The square of " + i + " is " + square + ".");
    }

    public static int square(int i) {
        return i * i;
    }
}
