class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low=1;
        int high=m;
        while(low<=high){
            long mid=(low+high)/2;
            long ans= (long)Math.pow(mid,n);
            if(ans==(long)m){
                return (int)mid;
            }
            else if (ans>(long)m){
                high=(int)mid-1;
            }
            else{
                low=(int)mid+1;
            }
        }
        return -1;
    }
}
