class Solution {
    public boolean isPalindrome(String s) {
        
        String s1=s.toLowerCase();
        int start=0;
        int end=s.length();
        while(start<end)
        {
            char st=s1.charAt(start);
            char en=s1.charAt(end-1);
            if(!Character.isLetterOrDigit(st)) //it checks for special characters 
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(en))
            {
                end--;
            }
            else
            {
                if(st!=en)
                {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
        
    }
}
