import java.util.Arrays;
import java.util.Scanner;

public class Pro25 {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int row = val.nextInt();
        System.out.print("Enter Number of columns : ");
        int col = val.nextInt();
        int[][] arr = new int[row][col] ;
        System.out.println("Enter Elements in Array ");
        for (int i =0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print("Eneter Element at Index ["+i+"]["+j+"]:");
                int el = val.nextInt();
                arr[i][j] = el ;
            }
        }
        //print the Array
        for (int i =0;i< arr.length;i++){
            System.out.print("\n");
            for (int j=0;j<arr[0].length;j++){
                System.out.print("["+ arr[i][j] + "]" );
            }
        }

        System.out.print("\nEnter The element you want to search : ");
        int target = val.nextInt();
        //traverse the Array and print the index of searchin value
        for (int i =0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (target == arr[i][j]){
                    System.out.print("Searched Element at Index ["+i+"]["+j+"]:");
                    return;
                }
            }
//            System.out.println("Enter the valid value ");
        }
    }
}
