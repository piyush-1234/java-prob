package FirstJava;

import java.util.Scanner;

public class AriaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        areaOfCircle(radius);

    }

    static double areaOfCircle(double radius)
    {
          double area = (double) Math.PI*radius*radius;
          System.out.println(area);
          return area;

    }
}
