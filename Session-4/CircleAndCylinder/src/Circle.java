/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 110619 PVHP-CodeGym     **
 *********************************************/
public class Circle {
    public double radius;
    public String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public static void main(String[] args) {
        System.out.print("Cirle");
        Circle circle = new Circle();
        System.out.print(circle);
        circle = new Circle(10, "red");
        System.out.print(circle + "\t");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius;
    }

    public String toString() {
        return "\nlấy giá trị bán kính: "
                + getRadius()
                + "\nLấy giá trị màu: "
                + getColor();
    }


}

