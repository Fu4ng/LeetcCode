import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersect {
    public static int[] Intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 ) {
            return nums1;
        }
        if (nums2.length ==0){
            return nums2;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> tmp = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                tmp.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
        }
        int[] inter = new int[tmp.size()];
        for (int k =0;k<inter.length;k++)
            inter[k] = tmp.get(k);
        return inter;
    }

    public static void main(String argc[]) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,1};
        int[] k = Intersect(nums1, nums2);
        for (int i : k
                ) {
            System.out.print(i);
        }
    }
}
