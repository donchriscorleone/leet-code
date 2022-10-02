public class Solution {
    public void merge(int[] nums1, int[] nums2, int m, int n) {
        if (nums1.length == 0 || nums2.length == 0) return;

        int c1 = 0;
        int c2 = 0;
        while (c1 < nums1.length) {
            if (nums1[c1] > nums2[c2] || nums1[c1] == 0) {
                if (n < nums1.length) {
                    nums1[n] = nums1[c1];
                    n++;
                }
                nums1[c1] = nums2[c2++];
            }
            c1++;
        }
//            n = 2
//

//        {1, 2}
//            c
//        {1}
//         p
    }
}
