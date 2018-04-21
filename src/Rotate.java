public class Rotate {
    private static void rotate(int[] nums, int k){
        int[] temp =new int[nums.length];
        System.arraycopy(nums,0,temp,0,nums.length);
        for (int i = 0;i<nums.length;i++){
            int index = (i+k)%(nums.length);
            nums[index] = temp[i];
        }
    }
    public static void main(String argc[]){
        int k=3;
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int i: nums
             ) {
            System.out.print(i);
        }

    }
}
