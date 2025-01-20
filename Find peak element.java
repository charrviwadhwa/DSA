class Solution {
    public int findPeakElement(int[] nums) {
        int c=0;
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]>nums[i+1])
        {
             c= i;
             break;
        }
        else
        {
            c= i+1;
        }

       }
       return c;
    }
}