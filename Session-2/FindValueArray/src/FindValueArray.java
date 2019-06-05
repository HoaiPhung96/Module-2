/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class FindValueArray {
  public static void main(String[] args) {
    String[] codegym = {"Phụng", "Đức", "Tín", "San", "Tài", "Bôn"};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào tên học viên: ");
    String input_name = scanner.nextLine();
    boolean isExist = false;
    for (int i = 0; i < codegym.length; i++) {
      if (codegym[i].equals(input_name)) {
        System.out.println("vị trí của học viên " + input_name + " là: " + (i + 1));
        isExist = true;
        break;
      }
    }
  }
}
