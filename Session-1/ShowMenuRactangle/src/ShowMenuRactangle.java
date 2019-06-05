import java.util.Scanner;

public class ShowMenuRactangle {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("   ---Menu---   ");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("Exit.");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int width, height;
                    System.out.print("nhập chiều rộng: ");
                    width = scanner.nextInt();
                    System.out.print("nhập chiều dài: ");
                    height = scanner.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*\t");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw the triangle");
                    System.out.println("  *** ***");
                    System.out.println(" *********");
                    System.out.println("  *******");
                    System.out.println("   ****");
                    System.out.println("    **");
                    break;
                case 3:
                    System.out.println("ahihi");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Không có lựa chọn này");
            }
        } while (choice != 0);
    }
}
