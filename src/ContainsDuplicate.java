import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int nums[]){
        if(nums.length ==1) return false;
        Arrays.sort(nums);
        for (int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
    public static void main(String argc[]){
        int[] nums = {3,1};
        boolean i = containsDuplicate(nums);
        System.out.print(i);
    }
}
