/*  Problem : Remove the duplicate element from the sorted array and push it at the end of the array and make it garbaje value "0" . 
 */


import java.util.Arrays;
import java.util.Scanner;

public class Pro25 {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,5,6};
        int i = 0;
        for (int j=1;j< arr.length;j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int j=i+1; j<arr.length;j++ ){
            arr[j]=0;
        }

        for (int j=0;j< arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}
