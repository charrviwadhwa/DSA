class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(nums[low]+nums[high]!=target){
            if(nums[low]+nums[high]<target){
                low++;
            }
            else{
                high--;
            }
        }
        return new int[]{low+1,high+1};
    }
}
