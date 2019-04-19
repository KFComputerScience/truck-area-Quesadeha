import java.util.*;

public class TruckArea {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int surfaceArea = 0;
        int deja = 2;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += parallelogram();
        surfaceArea += square();
        surfaceArea -= square();

        System.out.println("\nThe total area of Michaels Truck is : " + surfaceArea);

    }

    public static int triangle() {
        System.out.println("\nThe area of a triangle is : 1/2 * base * height");
        System.out.print("base > ");
        int base = in.nextInt();
        System.out.println("height > ");
        int height = in.nextInt();
        int area = (int) (0.5 * base * height);
        System.out.println("The area of this shape is: " + area);
        return area;
    }

    public static int square() {
        System.out.println("\nThe area of a square is : side * side");
        System.out.print("side > ");
        int side = in.nextInt();
        int area = (int) (side * side);
        System.out.println("The area of this shape is: " + area);
        return area;
    }

    public static int parallelogram() {
        System.out.println("\nThe area of a parallelogram is : base * height");
        System.out.print("base > ");
        int base = in.nextInt();
        System.out.println("height > ");
        int height = in.nextInt();
        int area = (int) (base * height);
        System.out.println("The area of this shape is: " + area);
        return area;
    }

    public static int circle() {
        System.out.println("\nThe area of a circle is : pi * (radius * radius)");
        System.out.print("radius > ");
        int radius = in.nextInt();
        System.out.println("pi > ");
        double pi = Math.PI;
        int area = (int) (pi * (radius * radius));
        System.out.println("The area of this shape is: " + area);
        return area;
    }
}