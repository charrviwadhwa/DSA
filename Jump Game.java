class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int jump=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            jump=nums[i]+i;
            max=Math.max(max,jump);
        }
            return true;
        }
        
    
}
