import java.util.Arrays;

public class MergedSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={1};
        meredArrs(nums1,3,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
    static void meredArrs(int[] nums1,int m,int[] nums2,int n){
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
