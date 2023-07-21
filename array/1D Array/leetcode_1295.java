import java.util.ArrayList;

public class no {
    public static void findNumbers(int[] nums) {
     int cnt = 0;
     int d_cnt;
        for (int i = 0; i < nums.length; i++) {
            d_cnt =0;
            while (nums[i]>0){
                d_cnt++;
                nums[i] = nums[i]/10;
            }

            if (d_cnt % 2 ==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {

     int[] arr={12,4452,123,22};
     findNumbers(arr);

    }
}
