class Solution {
    public int maxSubArray(int[] nums) {
        int overall_max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<nums.length;i++)
        {
            curr+=nums[i];
            overall_max=Math.max(overall_max,curr);
            if(curr<0)
            {
                curr=0;
            }

        }
        return overall_max;
    }
}
