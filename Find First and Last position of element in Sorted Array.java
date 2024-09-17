class Solution {
    public int search(int[]nums,boolean check,int t)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==t)

            {
                ans=mid;
                if(check==true)
        {
            high=mid-1;
        }
        else
        {
           low=mid+1;
        }
            }
            else if(nums[mid]<t)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int left=search(nums,true,target);
        int right=search(nums,false,target);
        int []arr=new int[2];
        arr[0]=left;
        arr[1]=right;
        return arr;
    }
}
