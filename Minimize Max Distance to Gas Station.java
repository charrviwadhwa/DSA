public class Solution {
    public static int gasStations(double d,int[]arr){
        int c=0;
        for(int i=1;i<arr.length;i++){
            int dist=(int)((arr[i]-arr[i-1])/d);
            if((arr[i]-arr[i-1])==dist*d){
                dist--;
            }
            c+=dist;
        }
        return c;
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        // Write your code here.
        double low=0;
        double high=0;
        for(int i=1;i<arr.length;i++){
            high=Math.max((double)(arr[i]-arr[i-1]),high);
        }
        while(high-low>1e-6){
            double mid=low+(high-low)/2;
            int c=gasStations(mid,arr);
            if(c>K){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return high;

    }
}
