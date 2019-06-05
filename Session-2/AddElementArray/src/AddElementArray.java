/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        int[] arr = {9, 3, 2, 4, 5, 6, 7, 1, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào vị trí cần thay đổi: ");
        int index = scanner.nextInt();
        if (index <= 1 || index >= arr.length - 1) {
            System.out.print("Vị trí này không có trong mảng");
        } else {
            for (int i = arr.length -1; i > index; i--){
                arr[i] = arr[i] -1;
            }
            System.out.print("nhập giá trị cần thay đổi: ");
            int input = scanner.nextInt();
            arr[index] = input;
            for (int j = 0; j<arr.length;j++){
                System.out.print(arr[j]+"\t");
            }
        }
    }
}