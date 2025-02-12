class Solution {
    public int minPatches(int[] nums, int n) {
       long canNumberUpto=1;
       int minIndex=0;
       int i=0;
       while(canNumberUpto<=n){
            if(i<nums.length && canNumberUpto>=nums[i]){
                canNumberUpto+=nums[i];
                i++;
            }
            else{
                canNumberUpto+=canNumberUpto;
                minIndex++;
            }
       }
       return minIndex;

    }
}
