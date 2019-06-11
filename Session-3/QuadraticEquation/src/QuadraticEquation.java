import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 2 nghiệm " + quadraticEquation.getRoot1());
        } else
            System.out.println("Phương trình không có nghiệm");
    }

    public double getterA() {
        return this.a;
    }

    public double getterB() {
        return this.b;
    }

    public double getterC() {
        return this.c;
    }

    public double getDiscriminant() {
        this.delta = this.b * this.b - 4 * this.a * this.c;

        return this.delta;
    }

    public double getRoot1() {

        return (-this.b + Math.sqrt(this.b * this.b - Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }

    public double getRoot2() {

        return (-this.b - Math.sqrt(this.b * this.b - Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }
}