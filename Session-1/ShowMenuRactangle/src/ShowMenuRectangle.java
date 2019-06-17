/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/

import java.util.Scanner;

public class ShowMenuRectangle {
    private static final int DEFAULT_NUMBER = -1;
    private static final int EXIT_NUMBER = 0;
    private static final int RECTANGLE_NUMBER = 1;
    private static final int HEART_NUMBER = 2;
    private static final int TRIANGLE_NUMBER = 3;
    private static final String NEW_LINE = "\n";


    public static void main(String[] args) {
        int choice = DEFAULT_NUMBER;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("   ---Menu---   ");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square heart");
            System.out.println("3.Print isosceles triangle");
            System.out.println("Exit.");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case RECTANGLE_NUMBER:
                    drawRectangle(scanner);
                    break;
                case HEART_NUMBER:
                    drawHeart();
                    break;
                case TRIANGLE_NUMBER:
                    drawTriangle(scanner);
                    break;
                case EXIT_NUMBER:
                    System.exit(EXIT_NUMBER);
                default:
                    System.out.print("Không có lựa chọn này");
            }
        } while (choice != EXIT_NUMBER);
    }

    private static void drawTriangle(Scanner scanner) {
        System.out.println("Draw triangle");
        System.out.println("Nhập cạnh đáy: ");
        int widthTriangle = scanner.nextInt();

        System.out.println("Nhập chiều cao: ");
        int heightTriangle = scanner.nextInt();

        for (int i = 0; i < heightTriangle; i++) {
            for (int j = 0; j < widthTriangle; j++) {
                System.out.print("*");
                if (i == j) break;
            }
            System.out.print(NEW_LINE);
        }
    }

    private static void drawHeart() {
        System.out.println("Draw the heart");
        System.out.println("  *** ***");
        System.out.println(" *********");
        System.out.println("  *******");
        System.out.println("   ****");
        System.out.println("    **");
    }

    private static void drawRectangle(Scanner scanner) {
        int width, height;
        System.out.print("nhập chiều rộng: ");
        width = scanner.nextInt();
        System.out.print("nhập chiều dài: ");
        height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*\t");
            }
            System.out.print(NEW_LINE);
        }
    }
}
