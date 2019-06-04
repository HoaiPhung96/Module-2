public class CountStudenPassing {
    public static void main(String[] args) {
        System.out.println("The Application to count the number of students pass.");

        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        do {
            System.out.print("Nhập vào độ dài mảng: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Độ dài mảng không quá 10");
        } while (size > 10);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm sinh viên " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Danh sách mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\nSố lượng học sinh vượt qua kỳ thi là: " + count);
    }
}