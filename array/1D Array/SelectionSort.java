public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minPso = i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[minPso] > arr[j]){
                    minPso = j;
                }
            }
            //swap
            int temp =arr[minPso];
            arr[minPso] = arr[i];
            arr[i]=temp;
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       int[] arr = {7,8,4,2,5,7,6,1,3,5,7,8,10};
        selectionSort(arr);
        printArray(arr);

    }
