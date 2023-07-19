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
            for (int i =0 ; i<arr.length; i++){
                if(target == arr[i]){
                    System.out.println("Value At Index [" + i + "]");
                }
            }



    }
}
