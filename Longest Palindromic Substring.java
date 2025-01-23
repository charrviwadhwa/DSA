class Solution {
    public int helper(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
    public String longestPalindrome(String s) {
         if (s == null || s.length() < 1){
             return "";
         }
        int start = 0;
        int max = 1;
        
        for (int i = 0; i < s.length(); i++) {
           
            int len1 = helper(s, i, i);
            int len2 = helper(s, i, i + 1);
            
            int curr_max = Math.max(len1, len2);
            if (curr_max > max) {
                start = i - (curr_max - 1) / 2;
                max = curr_max;
            }
        }
        
        return s.substring(start, start + max);
    }
}
