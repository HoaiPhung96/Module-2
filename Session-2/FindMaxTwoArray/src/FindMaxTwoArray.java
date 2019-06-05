/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class FindMaxTwoArray {
    public static void main(String[] args) {
        int soDong,soCot;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.print("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();
        int arr[][] = new int[soDong][soCot];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("arr[" + i + "," + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mảng arr là: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        int max = arr[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
