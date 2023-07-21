
public class exam2 {

    public static void minArr(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }

    public static void maxArr(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {2,5443,362},
                        {23,34,541,},
                        {13,54,78,643}
        };
        minArr(arr);
        maxArr(arr);
    }
}
