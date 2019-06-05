/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a, b;
        System.out.print("Nhập số thứ nhất: ");
        a = nhap.nextInt();
        System.out.print("Nhập số thứ hai: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("Không có ước chung lớn nhất. ");
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        System.out.println("Ước chung lớn nhất: " + a);
    }
}
