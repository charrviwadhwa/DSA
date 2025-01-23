class Solution {
     public int helper(String s, int k) {
        int[] freq = new int[26];
        int ans = 0;
        int d = 0;
        int i = 0;
        
        for (int j = 0; j < s.length(); j++) {
            
            if (freq[s.charAt(j) - 'a']++ == 0)
            {
                d++;
            }
           
            while (d > k) {
                if (--freq[s.charAt(i) - 'a'] == 0) 
                {
                    d--;
                }
                i++;
            }
            
           
            ans += j - i + 1;
        }
        
        return ans;
     }
    int countSubstr(String s, int k) {
        // your code here
       return helper(s, k) - helper(s, k-1);
    }
}
