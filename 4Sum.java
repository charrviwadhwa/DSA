
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       HashSet<List<Integer>>l1=new HashSet();
        Arrays.sort(nums);
    
        for(int i=0;i<nums.length-3;i++){
           for(int a=i+1;a<nums.length-2;a++){
                int j=a+1;
                int k=nums.length-1;
                while(j<k){
                    long sum=(long)nums[i]+(long)nums[a]+(long)nums[j]+(long)nums[k];
                    if(sum==target){
                            l1.add(Arrays.asList(nums[i], nums[a],nums[j], nums[k]));  
                    j++;
                    k--;
                    }
                    else if(sum<target){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
               
               
            }
           
        }
        
       return new ArrayList(l1);
 
    }
}
