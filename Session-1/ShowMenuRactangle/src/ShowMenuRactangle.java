import java.util.Scanner;

public class ShowMenuRactangle {
    public static void main(String[] args) {
//        System.out.println("   ---Menu---   ");
//        System.out.println("1.Print the rectangle");
//        System.out.println("2.Print the square triangle");
//        System.out.println("3.Print isosceles triangle");
//        System.out.println("Exit.");
        Scanner scanner = new Scanner(System.in);
        int width, height;
        System.out.print("nhập chiều rộng: ");
        width = scanner.nextInt();
        System.out.print("nhập chiều dài: ");
        height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.printf("*");
                break;
            }
            System.out.print("");
        }
//        System.out.print("\n");
    }
}
