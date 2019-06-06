import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài:");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều rộng:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật bạn nhập vào có:  \n" + rectangle.display());
        System.out.println("chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}