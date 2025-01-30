class Solution {
    public int longestOnes(int[] nums, int k) {
         int left = 0;
         int zero = 0;
        int n = nums.length;
        int ans = 0;
        
       
        for(int i = 0; i < n; i++){
            if(nums[i] == 0 ) zero++;
            if(zero > k){
                if(nums[left] == 0) zero--;
                left++;
            }
            if(zero <= k) ans = Math.max(ans, i-left+1);
        }
        return ans;
    }
}