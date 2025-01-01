class Solution {
    public int reverse(int x) {
        int c=x;


    
        long sum=0;
        while(c!=0){
            int a =c%10;

            sum=sum*10+a;
            c=c/10;
        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE){
            return 0;
        }
       

         return (int) sum;
        
        
    }
}