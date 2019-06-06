/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 060619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 7, 6, 9, 6, 8, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số cần xóa:");
        int index = scanner.nextInt();
        int cache = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== index) {
                cache = i;
            }
        }
        for (int i = cache; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
