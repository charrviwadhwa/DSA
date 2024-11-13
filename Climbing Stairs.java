class Solution {
    public int helper (int n,int[]arr)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==-1)
        {
            return 0;
        }
        if(arr[n]!=0)
        {
            return arr[n];
        }
        int p=helper(n-1,arr); // 1 ka jump
        int p1=helper(n-2,arr); // 2 ka jump
        int sum=p+p1;
        return arr[n]=sum;


    }
    public int climbStairs(int n) {
        int[]arr=new int [n+1];
        return helper(n,arr);

        
    }
}