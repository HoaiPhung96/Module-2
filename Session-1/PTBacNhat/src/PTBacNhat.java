import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai phương trình bậc nhất");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        if (a != 0){
            double solution = -b/a;
            System.out.printf("%f",solution);

        } else {
            if (b==0){
                System.out.printf("vô số nghiệm");

            }else {
                System.out.printf("vô nghiệm");
            }
        }
    }
}
