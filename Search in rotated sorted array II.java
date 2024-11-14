class Solution {
     public boolean binary(int []nums,int s,int e,int target)
    {
         int low=s;
        int high=e;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            else if(nums[mid]<=target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;

    }
    public boolean search(int[] nums, int target) {
         int k=0;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i-1]>nums[i])
        {
            k=i-1;
            break;
        }
       }
       boolean a=binary(nums,0,k,target);
       boolean b=binary(nums,k+1,nums.length-1,target);
       if(a)
       {
        return a;
       }
       else
       {
        return b;
       }
    }
}