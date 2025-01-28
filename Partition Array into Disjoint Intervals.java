class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;
        int[]arr=new int[nums.length];
        arr[n-1]=nums[n-1];
        for(int i=nums.length-2;i>=0;i--){
            arr[i]=Math.min(nums[i],arr[i+1]);
        }
        int leftmax=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            leftmax=Math.max(nums[i],leftmax);
            if(leftmax<=arr[i+1]){
                ans=i+1;
                break;
            }
        }
        return ans;
    }
}
