class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>l1=new HashSet();
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int k=nums.length-1;
        while(i<=nums.length-3){
        
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                         l1.add(Arrays.asList(nums[i], nums[j], nums[k]));  
                   j++;
                   k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }
            i++;
            j=i+1;
            k=nums.length-1;
        }
        
        return new ArrayList(l1);
    }
}
