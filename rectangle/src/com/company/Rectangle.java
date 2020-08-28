package com.company;

public class Rectangle {
    private static String color;
    private double width;
    private double height;

    public Rectangle(){
        setColor("Yellow");
        setWidth(1);
        setHeight(1);
    }

    public Rectangle(double height,double width){
        setColor("Yellow");
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(double height) {
        if(height<=0){
            this.height=1;
        }else {
            this.height=height;
        }
    }

    public void setWidth(double width) {
        if(width<=0){
            this.width=1;
        }else {
            this.width=width;
        }
    }

    public static void setColor(String color) {
        if(color==null){
            Rectangle.color="Yellow";
        }else {
            Rectangle.color=color;
        }
    }

    public static String getColor(){
        return color;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }
}
