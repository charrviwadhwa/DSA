class Solution {

    public int maxWater(int arr[]) {
        // Code Here
         if(arr.length==2){
            return Math.min(arr[1],arr[0]);
        }
       int max=0;
       int i=0;
       int j=arr.length-1;
        while(i<=j){
            int l=Math.min(arr[i],arr[j]);
            int b=Math.abs(i-j);
            max=Math.max(max,l*b);
            if(arr[i]<=arr[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return max;
    
    }
}
