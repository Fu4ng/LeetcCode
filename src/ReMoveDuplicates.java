import java.lang.reflect.Array;
import java.util.Arrays;

public class ReMoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int len =nums.length;
        int temp;
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                while(nums[i]==nums[j]&&len > j){
                    //用while 防止有类似[1,1,1]的例子出现
                    nums[j] = nums[len-1];
                    len--;
                }
            }
        }
        Arrays.sort(nums,1,len);
        return len;
    }
    public static void main(String args[]){
        int []nums = new int []{0,0,1,1,1,2,2,3,3,4};
        int len = ReMoveDuplicates.removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len ; i++) {
            System.out.print(nums[i]);
        }
    }
}
