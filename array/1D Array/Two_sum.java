
public class exam2 {
    public static void main(String[] args) {
        int[] arr = {2,5,5,22,61};
        int target = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j=1;j< arr.length;j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("["+i+"]+["+j+"]");
                }
            }
        }
    }
}
