

// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    public static int merge(int[] arr, int s, int mid, int e)
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
				c+=(mid-i+1);
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
		return c;
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
		
		c+=merge(arr, s, mid, e);
		
		
		return c;
		 
	}
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergesort(arr,0,arr.length-1);
    }
}