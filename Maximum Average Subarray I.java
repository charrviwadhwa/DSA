class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max =Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<k;i++){

                sum+=nums[i];

        }
        max=sum;
        for(int i=k;i<nums.length ;i++){
             sum=sum+nums[i]-nums[i-k];
             if(max<sum){
                max=sum;
             }
             
        }


        return max/k;
    }
}