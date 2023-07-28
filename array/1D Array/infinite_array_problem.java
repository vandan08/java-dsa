/*
Problem : Find position of an element in a sorted array of infinite numbers
Link : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

Logic : WE just have to increase our searching box with multiplication of length of the box ,
and search element with binary search
 */



public class infinite_array {
    public static void main(String[] args) {
        int[] arr ={3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        int target = 10;
        System.out.println(answer(arr,target));
    }

    public static int answer(int[] arr,int target){
        int start =0;
        int end =1;

        while (target > arr[end]){
            int newStart = end+1;
            end = end + (end - start + 1 ) *2;
            start = newStart;
        }
        return binary(arr,target,start,end);
    }

    public static int binary(int[] arr, int target, int start , int end) {

//        int start =0;
//        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
