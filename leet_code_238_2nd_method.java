package Arrays;

public class leet_code_238_2nd_method {
	public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]left=new int[n];
        int []right=new int[n];
        int[]ans=new int[nums.length];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<nums.length;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }   
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*nums[i+1];
                
        }
        for(int k=0;k<n;k++)
        {
            ans[k]=left[k]*right[k];
        }
        
        
        return ans;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int []ans=productExceptSelf(arr);
		for(int m=1;m<ans.length;m++)
		{
			System.out.print(ans[m]+" ");
		}
		
		

	}

}
