class Solution {
    public int lenLongestFibSubseq(int[] arr) {
         int n = arr.length;
        
        Set<Integer> set = new HashSet();
        for (int num : arr) {
            set.add(num);
        }
        int maxlen = 0;
       
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                int prev = arr[j];
                int curr = arr[i] + arr[j];
                int len = 2;

                while (set.contains(curr)) {
                    int temp = curr;
                    curr += prev;
                    prev = temp;
                    len++;
                    maxlen = Math.max(maxlen, len);
                }
            }
        }
        return maxlen;
    }
}