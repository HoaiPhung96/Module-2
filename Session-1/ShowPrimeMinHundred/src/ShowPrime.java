/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 060619 PVHP-CodeGym     **
 *********************************************/
public class ShowPrime {
    public static void main(String[] args) {
        System.out.println("Hiển thị số nguyên tố nhỏ hơn 100");
        for (int i = 0; i <= 100; i++) {
            if (checkNum(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean checkNum(int num) {
        boolean check = true;
        int i = 2;
        if (num < 2)
            return check = false;
        else {
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}