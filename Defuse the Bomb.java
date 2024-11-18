class Solution {
    public int[] decrypt(int[] code, int k) {
        int[]ans=new int[code.length];
        int n=code.length;
        if(k>0)
        {
            for(int i=0;i<n;i++)
            {
                int b=k;
                int sum=0;
                int j=i+1;
                while(b>0)
                {
                    int a=j%n;
                    sum+=code[a];
                    b--;
                    j++;
                }
                ans[i]=sum;
            }
        }
        else if(k<0)
        {
            for(int i=0;i<n;i++)
            {
                int b=k;
                int sum=0;
                int j=i-1;
                while(b<0)
                {
                    int a=(j%n + n)%n;
                    sum+=code[a];
                    b++;
                    j--;
                }
               
                ans[i]=sum;
            }
            
        
        }
        else 
        {
            for(int i=0;i<n;i++)
            {
                ans[i]=0;
            }
        }
        return ans;
    }
}
