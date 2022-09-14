import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        // Pur your code here
        double PI = (double) 3.14159265359;
        double radians = degrees * PI / 180;
        return radians;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        double PI = (double) 3.14159265359;
        double degrees = radians * 180 / PI;
        return degrees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        System.out.print(toRadians(degrees));
        System.out.println(Math.toRadians(degrees));
        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("\nType radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.print(toDegrees(radians));
        System.out.println(Math.toDegrees(radians));

        // Add System.out, your method call, and Math.toDegrees call here
    }
}
