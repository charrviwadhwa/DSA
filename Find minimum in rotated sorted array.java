class Solution {
     public int binary(int []nums,int s,int e)
    {
       
        return nums[s];

    }
    public int findMin(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        int k=0;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i-1]>nums[i])
        {
            k=i-1;
            break;
        }
       }
        int a=binary(nums,0,k);
       int b=binary(nums,k+1,nums.length-1);
      
       if(a<b)
       {
        return a;
       }
       else
       {
        return b;
       }

    }
}