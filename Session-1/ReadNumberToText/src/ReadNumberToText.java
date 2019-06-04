import java.util.Scanner;

public class ReadNumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhâp vào số cần đọc: ");
        int num = scanner.nextInt();
        String ReadNumberToText;
        switch (num) {
            case 0:
                ReadNumberToText = "zero";
                break;
            case 1:
                ReadNumberToText = "one";
                break;
            case 2:
                ReadNumberToText = "two";
                break;
            case 3:
                ReadNumberToText = "three";
                break;
            case 4:
                ReadNumberToText = "four";
                break;
            case 5:
                ReadNumberToText = "five";
                break;
            case 6:
                ReadNumberToText = "six";
                break;
            case 7:
                ReadNumberToText = "seven";
                break;
            case 8:
                ReadNumberToText = "eight";
                break;
            case 9:
                ReadNumberToText = "nine";
                break;
            default:
                ReadNumberToText = "out of ability";

        }
        System.out.println(num + " = " + ReadNumberToText);
    }
}
