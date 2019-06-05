/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của mảng 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhập giá trị của mảng 2: ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int size = arr1.length + arr2.length;
        arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < size; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.println("mảng sau khi gộp là: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
