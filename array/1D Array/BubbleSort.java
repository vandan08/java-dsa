public static void bubbleSort(int[] arr){
        int swap=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       int[] arr = {7,8,4,2,5,7,6,1,3,5,7,8,10};
        bubbleSort(arr);
        printArray(arr);

    }

