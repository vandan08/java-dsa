import java.util.Arrays;
import java.util.Scanner;

public class Pro25 {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

    //        Sorted Array binary search !!
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            // array must be sorted
            System.out.print("Enter value to be search in given Array : ");
            int target = val.nextInt();
            int left =0 ;
            int right = arr.length - 1;
            while (left <= right){
                int mid = left + (right - left) /2 ;
                    if (arr[mid] == target){
                        System.out.println("Value : " + target + " is At index : [" + mid + "]");
                        return;
                    } else if (target > arr[mid]  ) {
                        left = mid +1;
                    } else {
                        right = mid -1 ;
                    }
            }



    }
}
