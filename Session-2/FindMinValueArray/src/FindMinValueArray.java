public class FindMinValueArray {
    public static void main(String[] args) {
        int[] arr = {10,3,6,4,5,8,2};
        int index = minValue(arr);
        System.out.print("Phần tử nhỏ nhất trong mảng là: "+ arr[index]);
    }
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
