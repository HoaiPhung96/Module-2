/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class ConverTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("\n" + "Software Conver Temperature");
            System.out.println("1.Chuyển đổi độ F to C");
            System.out.println("2.Chuyển đổi độ C to F");
            System.out.println("0.Exit.");
            System.out.print("Lựa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập vào dộ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.print("F to C = " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Nhập vào độ C: ");
                    celsius = input.nextDouble();
                    System.out.print("C to F = " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
