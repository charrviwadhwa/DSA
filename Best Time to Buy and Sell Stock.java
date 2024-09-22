class Solution {
    public int maxProfit(int[] prices) {
        int overall_max=0;
        int overall_min=prices[0];
        
        for(int i=1;i<=prices.length-1;i++)
        {
           
                int curr=prices[i]-overall_min;
                overall_max=Math.max(overall_max,curr);
                overall_min=Math.min(overall_min,prices[i]);
           
        }
       
      
            return overall_max;
        
    }
}
