class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // edge case
        if (n == 0) {
            return;
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            int curI = nums1[i];
            int curJ = nums2[j];
            if (curI > curJ) {
                nums1[k] = curI;
                i --;
            } else {
                nums1[k] = curJ;
                j --;
            }
            k --;
        }

        while (i >= 0) {
            nums1[k] = nums1[i];
            k --;
            i --; 
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            k --;
            j --;
        }
    }
}