
public class exam2 {

    public static void minArr(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void maxArr(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,5,22,61};
        minArr(arr);
        maxArr(arr);
    }
}
