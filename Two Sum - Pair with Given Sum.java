

// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int sum=arr[i]+arr[j];
            if(sum<target)
            {
                i++;
            }
            else if(sum>target)
            {
                j--;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
