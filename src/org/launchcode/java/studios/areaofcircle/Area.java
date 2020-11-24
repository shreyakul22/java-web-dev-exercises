package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;
        double radius;

        System.out.println("Enter a radius: ");
         radius = input.nextDouble();

        area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " +radius+ " is: " +area);


    }
}
