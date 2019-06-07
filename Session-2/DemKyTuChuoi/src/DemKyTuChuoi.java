/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 060619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class DemKyTuChuoi {
  public static void main(String[] args) {
    String string;
    char kytu;
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("nhap vao chuoi: ");
    string = scanner.nextLine();
    System.out.print("Nhap vao ky tu: ");
    kytu = scanner.next().charAt(0);
    for (int i = 0; i< string.length();i++){
        if (string.charAt(i)==kytu){
            count++;
        }
    }
    System.out.print("Số lần xuất hiện ký tự "+kytu+ " trong chuỗi "+string+ " là: "+count);
  }
}
