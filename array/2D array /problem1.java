/*  Problem : Rotate 3x3 matrix like

                [1][2][3]               [7][4][1]
                [4][5][6]     ----->    [8][5][2]
                [7][8][9]               [9][6][3]

    Solution : To solve this problem we have to first rotate this matrix diogonaly like
                [1][2][3]               [9][6][3]
                [4][5][6]    ----->     [8][5][2]
                [7][8][9]               [7][4][1]

Step : 2 Then flip the Diogonaly rotated matrix's first row and last row like 

            [9][6][3]               [7][4][1]
            [8][5][2]    ------>    [8][5][2]
            [7][4][1]               [9][6][3]

 */


import java.util.Arrays;
import java.util.Scanner;

public class Pro25 {

    public static void rotate(int[][] arr){
        flipDiogonal(arr);
//        flipHorizontally(arr);
    }
    public static void flipDiogonal(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                int curr = arr[i][j];
                arr[i][j]=arr[(arr.length)-j-1][(arr.length)-i-1];
                arr[(arr.length)-j-1][(arr.length)-i-1]=curr;
            }
        }
    }

    public static void flipHorizontally(int[][] arr){
        for (int i=0;i<arr.length/2;i++){
            for (int j =0 ; j< arr.length;j++){
                int curr = arr[i][j];
                arr[i][j]=arr[(arr.length)-i-1][j];
                arr[(arr.length)-i-1][j] = curr;
            }
        }
    }
    public static void main(String[] args) {
    int[][] arr = {{1, 2, 3},
                   {4, 5, 6},
                    {7, 8, 9},
    };

    rotate(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print("\n");
            for (int j=0;j<arr[0].length;j++){
                System.out.print("[" + arr[i][j] + "]");
            }
        }


    }
}
