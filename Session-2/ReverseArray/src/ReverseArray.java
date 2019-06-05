/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập vào độ dài mảng: ");
            size = scanner.nextInt();
            if (size>20)
                System.out.println("độ dài mảng không quá 20");
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("nhập số "+ (i+1)+" :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Mảng nhập vào là: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // array reverse
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println();
        System.out.printf("%-20s%s", "Mảng đảo ngược là: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
