
public class no {

    public static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        swap(arr,1,4);
        for (int i=0;i< arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
