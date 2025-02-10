class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap();
    
        int n=nums.length;
        long c=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i]-i,mp.getOrDefault(nums[i]-i,0)+1);
        }
        
        for(int val: mp.values()){
            if(val>1){
                c+=(long)val*(val-1)/2;
            }
        }
        long pairs=(long)n*(n-1)/2;
        return pairs-c;
    }
}