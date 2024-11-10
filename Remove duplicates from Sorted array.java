class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
       Arrays.sort(nums);
       int i=1;
        int j=1;
       while(j<nums.length)
        {
            
            if(nums[j-1]==nums[j])
            {
             j++;   
            }
            else
            {
                nums[i]=nums[j];
                i++;
                j++;
                //k++;
            }
           
        }
       
        return i;
    }
}