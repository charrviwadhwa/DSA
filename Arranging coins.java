class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int c=0;
        while(i<=n)
        {
         n=n-i;
          i++;
          
            //System.out.println(c);

        }
        return i-1;
    }
}
