class Solution {
    public String longestCommonPrefix(String[] strs) {
        int s=0;
        Arrays.sort(strs) ;
       String  l=strs[0] ;
        String l2=strs[strs.length-1];
        for(int i=0;i<l.length() && i<l2.length();i++)
        {
           if(l.charAt(i)==l2.charAt(i))
           {
            s++;
           }
           else
           {
            break;
           }
      
            
        }
        return l.substring(0,s);
    }
}
