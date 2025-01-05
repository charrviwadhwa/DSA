class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        double[][]arr=new double[wt.size()][3];
          for(int i=0;i<wt.size();i++){
           arr[i][0] = (double) val.get(i) / (double)wt.get(i);  
            arr[i][1] = val.get(i);
            arr[i][2] = wt.get(i);
        }
        Arrays.sort(arr, (a,b) -> Double.compare(b[0], a[0]));
        int sum=0;
        double ans=0.0;
        for(int i=0;i<wt.size();i++){
            if(sum+arr[i][2]<=capacity){
                sum+=arr[i][2];
                ans+=(double)arr[i][1];
            }
            else{
                int diff=capacity-sum;
                ans+=(double)(arr[i][1]/arr[i][2])*diff;
                break;
                
            }
        }
        return ans;
    }
}
