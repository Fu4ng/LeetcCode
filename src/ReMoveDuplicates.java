public class ReMoveDuplicates {
    public static int removeDuplicates(int[] nums){
        int len =nums.length;
        int temp;
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    nums[j] = nums[len-1];
                    len--;
                }
            }
        }
        return len;
    }
    public static void main(String args[]){
        int []nums = new int []{0,0,1,1,1,2,2,3,3,4};
        int len = ReMoveDuplicates.removeDuplicates(nums);
        System.out.print(len);
    }
}
