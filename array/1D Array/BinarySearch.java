
public class Main {
    public static int binarySearch(int[] arr,int target){
     int start =0 ;
     int end = arr.length-1;

     while (start<=end){
         //find the middle element
         int mid = start + (end - start)/2;

         if (target < arr[mid]){
             end = mid + 1;
         } else if (target > arr[mid]) {
             start = mid -1 ;
         } else {
            return mid;
         }
     }
     return -1;
    }
        public static void main(String[] args) {

        int[] arr = {1,4,6,7,8,9,12,22};
            System.out.println(binarySearch(arr,7));
        }
}
