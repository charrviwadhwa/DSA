class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
        {
            return -1;
        }
        int n=needle.length();
        for(int i=0;i<=haystack.length()-n;i++)
        {
            String str=haystack.substring(i,i+n);
            if(str.equals(needle))
            {
                return i;
            }
        }
        return -1;

        
    }
}
