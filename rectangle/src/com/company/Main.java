package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        double width;
        double height;
        String color;

        //Default constructor
        System.out.printf("Width default = %f%n",rectangle.getWidth());
        System.out.printf("Height default = %f%n", rectangle.getHeight());
        System.out.printf("Color default = %s%n", Rectangle.getColor());


        System.out.print("Enter width: ");
        width=input.nextDouble();

        System.out.print("Enter height: ");
        height=input.nextDouble();

        System.out.print("Enter color: ");
        color=input.next();

        rectangle=new Rectangle(height,width);
        Rectangle.setColor(color);

        //Constructor with parameter
        System.out.printf("Width  = %f%n",rectangle.getWidth());
        System.out.printf("Height  = %f%n", rectangle.getHeight());
        System.out.printf("Color  = %s%n", Rectangle.getColor());

        System.out.printf("Area = %f%n", rectangle.getArea());
        System.out.printf("Parameter = %f%n", rectangle.getPerimeter());

    }
}
