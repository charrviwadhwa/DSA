class Solution {
    public boolean check(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean prime(int n)
    {
       
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean primeSubOperation(int[] nums) {

       for(int i=0;i<nums.length;i++)
       {
        
        if(!check(nums))
        {int pri=0;
         int b;
         if(i==0)
         {
            b=nums[0];
         }
         else{
            b=nums[i]-nums[i-1];
         }
            if (b<= 0) {
                return false;
            }
            for(int j=b-1;j>=2;j--)
            {
                if(prime(j))
                {
                    pri=j;
                   
                    break;
                }
            }
        
               nums[i]-=pri;
            
                
          

        }
       
       }
       return true ;
    }
}
