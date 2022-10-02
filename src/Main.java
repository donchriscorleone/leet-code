import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        //TODO: not working for this edge case
        // nums1 = new int[] {2, 0};
        // int m = 1;
        // int[] nums2 = new int[] {1};
        // int n = 1;
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n = 3;
        sol.merge(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }
}