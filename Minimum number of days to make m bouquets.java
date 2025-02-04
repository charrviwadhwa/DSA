class Solution {
    public boolean canMake(int[]nums,int m,int k,int time){
        int bouquet=0;
        int collected=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=time){
                //ith flower has bloomed
                collected++;
                if(collected==k){
                    bouquet++;
                    collected=0;
                }
            }
            else{
                //ith flower has not bloomed
                collected=0;
            }
        }
        return bouquet>=m;
    }
    public int minDays(int[]nums, int m, int k) {
        int low=0;
        int high=0;
        int ans=-1;  // time complexity n.log(high-low)
        for(int i=0;i<nums.length;i++){
            low=Math.min(nums[i],low);
        }
        for(int i=0;i<nums.length;i++){
           high=Math.max(nums[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMake(nums,m,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
