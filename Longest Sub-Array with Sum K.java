class Solution {
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
         int n = arr.length; 

        HashMap<Long, Integer> mp = new HashMap();
        long sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            long r = sum - k;

            if (mp.containsKey(r)) {
                int len = i - mp.get(r);
                max = Math.max(max, len);
            }


            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }

        return max;
    
    }
}
