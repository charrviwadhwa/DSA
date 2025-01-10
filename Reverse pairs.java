class Solution {
     public static void merge(int[] arr, int s, int mid, int e)
	{
	
		int[] ans=new int[e-s+1];
		int index=0;
		
		int i=s;
		int j=mid+1;
		int c=0;
		while(i<=mid && j<=e)
		{
			if(arr[i]<=arr[j])
			{
				ans[index]=arr[i];
				index++;
				i++;
			}
			else
			{
				ans[index]=arr[j];
				index++;
				j++;
			}
		}
		
		while(i<=mid)
		{
			ans[index]=arr[i];
			index++;
			i++;
		}
		while(j<=e)
		{
			ans[index]=arr[j];
			index++;
			j++;
		}
		  for (int k = 0;k<ans.length; k++) {
            arr[k+s] = ans[k];
        }
		
	}
    public static int count(int[]arr,int low,int mid,int high){
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)arr[i]>(long)2*arr[right]){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }
	public static int mergesort(int[]arr,int s,int e)
	{
	    int c=0;
	    if(s>=e){
	        return c;
	    }
		int mid=(s+e)/2;
		c+=mergesort(arr,s,mid);
		c+=mergesort(arr,mid+1,e);
		c+=count(arr,s,mid,e);
		merge(arr, s, mid, e);
		
		
		return c;
    }
    public int reversePairs(int[] nums) {
       return mergesort(nums,0,nums.length-1);
    }
}