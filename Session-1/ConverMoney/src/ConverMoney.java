import java.util.Scanner;

public class ConverMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào USD cần đổi: ");
        usd = scanner.nextDouble();
        double conver = usd * 23000;
        System.out.print("Giá trị chuyển đổi là: "+conver+"VND");
    }
}
