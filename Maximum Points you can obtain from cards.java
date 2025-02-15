class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
            int curr=sum;
            int m=k-1;
            int j=cardPoints.length-1;
            while(m>=0){
                sum+=cardPoints[j]-cardPoints[m];
                curr=Math.max(curr,sum);
                m--;
                j--;
            }
            return curr;
        
        
    }
}