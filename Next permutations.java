class Solution {
    public void reverse(int i, int[] nums) {
        int n = nums.length;
        int j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2; 
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
          
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

           
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

       
        reverse(i + 1, nums);
    }
}
