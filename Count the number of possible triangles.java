class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
         int count=0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                if(arr[left]+arr[right]>arr[i]){
                    count+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }

        }
        return count;
    }
}
