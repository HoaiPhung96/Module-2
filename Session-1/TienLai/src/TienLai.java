import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double laisuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số tiền: ");
        tien = input.nextDouble();
        System.out.print("nhập vào tháng: ");
        thang = input.nextInt();
        System.out.print("Lãi suất: ");
        laisuat = input.nextDouble();
        double total = 0;
        for (int i = 0; i < tien; i++) {
            total = tien * (laisuat / 100) / 12 * thang;
        }
        System.out.println("Tổng tiền: " + total);
    }
}
