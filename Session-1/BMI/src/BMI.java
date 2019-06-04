import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, width, bmi;
        System.out.print("nhập vào chiều cao của bạn (meter): ");
        height = scanner.nextDouble();
        System.out.print("Nhập vào cân nặng của bạn (kg): ");
        width = scanner.nextDouble();
        bmi = width / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Nomal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
