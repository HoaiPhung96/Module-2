/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 040619 PVHP-CodeGym     **
 *********************************************/
import java.util.Scanner;

public class FindMaxArray {
  public static void main(String[] args) {
    System.out.println("Chương trình tìm kiếm giá trị lớn nhất trong mảng.");
    int size;
    int[] array;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("nhập vào độ dài mảng: ");
      size = scanner.nextInt();
      if (size > 20) System.out.println("độ dài mảng không quá 20");
    } while (size > 20);
    array = new int[size];
    int i = 0;
    while (i < array.length) {
      System.out.println("nhập phần tử " + (i + 1) + " : ");
      array[i] = scanner.nextInt();
      i++;
    }
    System.out.println("Mảng vừa nhập vào: ");
    for (int j=0; j < array.length;j++){
      System.out.print(array[j]+"\t");
    }
    int max = array[0];
    int index = 1;
    for (int j = 0; j < array.length; j++){
        if (array[j]>max){
            max = array[j];
            index = j + 1;
        }
    }
    System.out.println("giá trị lớn nhất trong mảng là "+max+ " ở vị trí "+index);
  }
}
