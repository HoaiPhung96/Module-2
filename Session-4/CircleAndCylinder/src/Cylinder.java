/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 110619 PVHP-CodeGym     **
 *********************************************/
public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public static void main(String[] args) {
        System.out.println("[Bài tập] Lớp Circle và lớp Cylinder");
        Cylinder cylinder = new Cylinder();
        System.out.println("hien thi tu he thong " + cylinder);
        cylinder = new Cylinder(12, "blue", 10.0);
        System.out.print("truong hop nhap tren" + cylinder + "\t");
        System.out.print("the tich: " + cylinder.getVolume());
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nlay gia tri: height "
                + getHeight();
    }


}
