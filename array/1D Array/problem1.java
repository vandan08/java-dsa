/*  Problem : Moves every zero element from the array to the last elements ,
    in other words bring evry non-zero elements to the front of the array !!
 */


import java.util.Arrays;
import java.util.Scanner;

public class Pro25 {
    public static void main(String[] args) {

        int[] arr = {0,1,0,0,21,0,0,12};
        int current = 0;
        for (int i =0 ; i< arr.length;i++){
            if (arr[i] != 0 ){
                arr[current] = arr[i];
                current++;
            }
        }

        for ( int i = current  ; i< arr.length;i++){
            arr[i] = 0;
        }

        for (int i =0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
