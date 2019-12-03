package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double radius;
        double area;


        input = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle");
        radius = input.nextDouble();
        Circle myCircle = new Circle();
        myCircle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + myCircle.getArea(radius));

    }
}
